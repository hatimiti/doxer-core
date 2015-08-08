package org.doxer.xbase.validation.validator;

import static com.github.hatimiti.doxer.common.util._Ref.*;
import static org.doxer.xbase.util._Container.*;

import org.dbflute.bhv.AbstractBehaviorWritable;
import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.ConditionBean;

import com.github.hatimiti.doxer.common.message.AppMessagesContainer;
import com.github.hatimiti.doxer.common.util._Obj;
import com.github.hatimiti.doxer.common.validation.Vval;
import com.github.hatimiti.doxer.common.validation.validator.BaseFieldValidator;

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
		this.bhvClass = bhvClass;
		this.cb = cb;
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

		AbstractBehaviorWritable<?, ?> bhv = getComponent(bhvClass).get();
		int count = (int) invoke(getMethod(bhvClass, "readCount", ConditionBean.class).get(), bhv, cb);
		return count <= 0;
	}

	@Override
	protected String getDefaultMessageKey() {
		return NOT_EXISTS_FIELD_VALIDATOR_KEY;
	}

}
