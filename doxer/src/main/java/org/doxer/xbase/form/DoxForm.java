package org.doxer.xbase.form;

import lombok.Data;

import org.slf4j.Logger;

import com.github.hatimiti.doxer.common.util._Obj;

@Data
public abstract class DoxForm implements Form {

	protected static final Logger LOG = _Obj.getLogger();

}

