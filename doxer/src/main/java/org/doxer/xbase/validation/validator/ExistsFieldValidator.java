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

		AbstractBehaviorWritable<?, ?> bhv = getComponent(bhvClass).get();
		int count = (int) invoke(getMethod(bhvClass, "readCount", ConditionBean.class).get(), bhv, cb);
		return 0 < count;
	}

	@Override
	protected String getDefaultMessageKey() {
		return EXISTS_FIELD_VALIDATOR_KEY;
	}

}
