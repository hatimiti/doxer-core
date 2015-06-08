package org.doxer.xbase.form;

import org.dbflute.Entity;

import com.github.hatimiti.flutist.common.domain.supports.Condition;

/**
 * エンティティと対となる Form のための基底クラス．<br />
 * 基本的にはマスタメンテなどに利用する．
 * @author hatimiti
 *
 */
public abstract class BaseEntityForm<E extends Entity> extends DoxForm {

	private static final long serialVersionUID = 1L;

	public abstract void copyToEntity(E entity);

	/**
	 * 楽観的排他用 更新番号
	 */
	@Condition(session = true)
	public String updNum;

}