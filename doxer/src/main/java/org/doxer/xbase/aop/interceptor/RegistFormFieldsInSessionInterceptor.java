package org.doxer.xbase.aop.interceptor;

import static java.lang.String.*;
import static org.doxer.xbase.util._Container.*;

import java.lang.reflect.Field;

import org.aopalliance.intercept.MethodInvocation;
import org.doxer.xbase.aop.interceptor.supports.Session;
import org.doxer.xbase.form.type.FormType;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import com.github.hatimiti.doxer.common.domain.supports.Condition;
import com.github.hatimiti.doxer.common.util._Obj;
import com.github.hatimiti.doxer.common.util._Ref;

/**
 * 対象 Controller メソッドの Form 引数が保持するフィールドの内、
 * {@code @Condition(session = true)}が付加されているものをセッションに登録、またはセッションから取得してセットする．
 *
 * {@code @Condition }の属性{@code prefRequest}が true の場合は、リクエストパラメータの値が優先される．
 * prefRequest が true の場合でも、リクエストパラメータが送信されてきていない場合は、Session から値を設定する．
 *
 * @author hatimiti
 */
@Component
public class RegistFormFieldsInSessionInterceptor extends BaseMethodInterceptor {

	/**
	 * ログ出力用オブジェクト取得
	 */
	protected static final Logger LOG = _Obj.getLogger();

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// セッションの値をフィールドにセット
		processSession(invocation, true);
		// アクションメソッド実行
		Object result = invocation.proceed();
		// フィールドの値をセッションにセット
		processSession(invocation, false);

		return result;
	}

	private void processSession(MethodInvocation invocation, boolean isSetSessionToBean) {
		getForm(invocation).ifPresent(form -> {
			setup4Session(isSetSessionToBean, form, "", false);
		});
	}

	protected void setup4Session(boolean isSetSessionToBean, Object origBean, String path, boolean isSessionParent) {
		_Ref.getAllFields(origBean.getClass()).forEach(bean -> {
			setup4Session(bean, isSetSessionToBean, origBean, path, isSessionParent);
		});
	}

	protected void setup4Session(
			Field beanField, boolean isSetSessionToBean, Object origBean, String path, boolean isSessionParent) {

		Condition condition = beanField.getAnnotation(Condition.class);
		Session session = beanField.getAnnotation(Session.class);

		boolean isSessionField = (session != null)
				|| (condition != null && condition.session());

		if (!isSessionField && !isSessionParent) {
			return;
		}

		beanField.setAccessible(true);
		Object bean = uncheckGet(beanField, origBean);
		LOG.debug("target: " + bean);

//		// 再帰処理
//		if (isFormType(bean)) {
//			setup4Session(isSetSessionToBean, bean, path, isSessionField);
//			continue;
//		}

		String beanFieldName = beanField.getName();

		// クラス完全修飾名_フィールド名 をセッションのキーとする
		String sessionKey = path + "_" + origBean.getClass().getName() + "_" + beanFieldName;

		if (isSetSessionToBean) {
			// フィールド名取得

			if (condition != null && condition.prefRequest()) {
				// リクエスト値を優先する場合

				String param = getHttpServletRequest().getParameter(beanFieldName + (isFormType(bean) ? ".val" : ""));
				if (param != null) {
					setRequestValue(beanField, origBean, bean, param);
					return;
				}
			}

			// Beanにセッションの値をセット
			setSessionValue(sessionKey, beanField, origBean, bean);

		} else {
			// セッションにBeanの値をセット
			getHttpSession().setAttribute(sessionKey, bean);
		}
	}

	private void setSessionValue(String sessionKey,
			Field beanField, Object origBean, Object bean) {

		Object sessionValue = getHttpSession().getAttribute(sessionKey);
		if (sessionValue != null/* && bean == null*/) {
			uncheckSet(beanField, origBean, sessionValue);
		}
	}

	private boolean isFormType(Object bean) {
		return bean instanceof FormType;
	}

	private void setRequestValue(
			Field beanField, Object origBean, Object bean, String param) {

		try {
			if (isFormType(bean)) {
				_Ref.getFieldIncludedSuperByName(bean.getClass(), "val").get().set(bean, param);
			} else {
				beanField.set(origBean, param);
			}
		} catch (Exception e) {
			throw new RuntimeException(format(
					"リクエスト値をセッション登録する場合、フィールド(%s) の型は %s または %s である必要があります．",
					beanField.getName(),
					String.class.getName(),
					FormType.class.getName()), e);
		}

		return;
	}

	private Object uncheckGet(Field field, Object fromBean) {
		try {
			return field.get(fromBean);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	private void uncheckSet(Field field, Object toBean, Object value) {
		try {
			field.set(toBean, value);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

}
