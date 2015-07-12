package org.doxer.app.sample.mail;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.doxer.xbase.form.DoxForm;
import org.springframework.stereotype.Component;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class SendMailForm extends DoxForm {

}
