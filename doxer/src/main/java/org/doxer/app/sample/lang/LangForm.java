package org.doxer.app.sample.lang;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.doxer.xbase.form.DoxForm;
import org.doxer.xbase.util._Container;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.domain.supports.Condition;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class LangForm extends DoxForm {

	@Condition String lang;

	public String getMessage() {
		return _Container.getComponent(MessageSource.class).get().getMessage("samplemes", null, _Container.getAccessUser().getLocale());
	}

}
