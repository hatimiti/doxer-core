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
 * 非存在チェック
 * @author hatimiti
 *
 */
public class NotExistsFieldValidator extends BaseFieldValidator {

	public static final String NOT_EXISTS_FIELD_VALIDATOR_KEY =
		"valid.exists.not";

	protected Class<? extends AbstractBehaviorWritable<?, ?>> bhvClass;
	protected AbstractConditionBean cb;

	public NotExistsFieldValidator(AppMessagesContainer container,
			Class<? extends AbstractBehaviorWritable<?, ?>> bhvClass,
			AbstractConditionBean cb) {
		super(container);
	}

	@Override
	protected boolean checkSpecifically(Vval value) {
		return checkNotExists(value.getValues()[0], bhvClass, cb);
	}

	public static boolean checkNotExists(
			final String value,
			final Class<? extends AbstractBehaviorWritable<?, ?>> bhvClass,
			final AbstractConditionBean cb) {

		if (_Obj.isEmpty(value)) {
			return true;
		}

		AbstractBehaviorWritable<?, ?> bhv = _Container.getComponent(bhvClass).get();
		Integer count = (Integer) _Ref.invoke(_Ref.getMethod(bhvClass, "selectCount", cb.getClass()).get(), bhv, cb);
		return _Obj.isNotEmpty(count) && count <= 0;
	}

	@Override
	protected String getDefaultMessageKey() {
		return NOT_EXISTS_FIELD_VALIDATOR_KEY;
	}

}
