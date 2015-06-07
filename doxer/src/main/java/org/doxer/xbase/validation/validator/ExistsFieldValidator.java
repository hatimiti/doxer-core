package org.doxer.xbase.validation.validator;

import org.dbflute.bhv.AbstractBehaviorWritable;
import org.dbflute.cbean.AbstractConditionBean;
import org.doxer.xbase.util._Container;

import com.github.hatimiti.flutist.common.message.AppMessagesContainer;
import com.github.hatimiti.flutist.common.util._Obj;
import com.github.hatimiti.flutist.common.util._Ref;
import com.github.hatimiti.flutist.common.validation.Vval;
import com.github.hatimiti.flutist.common.validation.validator.BaseFieldValidator;

/**
 * 存在チェック
 * @author hatimiti
 *
 */
public class ExistsFieldValidator extends BaseFieldValidator {

	public static final String EXISTS_FIELD_VALIDATOR_KEY =
		"valid.exists";

	protected Class<? extends AbstractBehaviorWritable<?, ?>> bhvClass;
	protected AbstractConditionBean cb;

	public ExistsFieldValidator(AppMessagesContainer container,
			Class<? extends AbstractBehaviorWritable<?, ?>> bhvClass,
			AbstractConditionBean cb) {
		super(container);
		this.bhvClass = bhvClass;
		this.cb = cb;
	}

	@Override
	protected boolean checkSpecifically(Vval value) {
		return checkExists(value.getValues()[0], bhvClass, cb);
	}

	public static boolean checkExists(
			final String value,
			final Class<? extends AbstractBehaviorWritable<?, ?>> bhvClass,
			final AbstractConditionBean cb) {

		if (_Obj.isEmpty(value)) {
			return true;
		}

		AbstractBehaviorWritable<?, ?> bhv = _Container.getComponent(bhvClass).get();
		Integer count = (Integer) _Ref.invoke(_Ref.getMethod(bhvClass, "selectCount", cb.getClass()).get(), bhv, cb);
		return _Obj.isNotEmpty(count) && 0 < count;
	}

	@Override
	protected String getDefaultMessageKey() {
		return EXISTS_FIELD_VALIDATOR_KEY;
	}

}
