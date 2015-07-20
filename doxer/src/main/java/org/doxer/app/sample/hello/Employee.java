package org.doxer.app.sample.hello;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class Employee {

	private String name;
	private Date birthDate;
	private BigDecimal payment;
	private BigDecimal bonus;

	public Employee(String name, Date birthDate, BigDecimal payment, BigDecimal bonus) {
		this.name = name;
		this.birthDate = birthDate;
		this.payment = payment;
		this.bonus = bonus;
	}

	public Employee(String name, Date birthDate, double payment, double bonus) {
		this(name, birthDate, new BigDecimal(payment), new BigDecimal(bonus));
	}

}
