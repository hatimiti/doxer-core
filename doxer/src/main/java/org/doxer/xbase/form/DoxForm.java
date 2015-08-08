package org.doxer.xbase.form;

import org.slf4j.Logger;

import lombok.Data;

import com.github.hatimiti.doxer.common.util._Obj;

@Data
public abstract class DoxForm implements Form {

	protected Logger LOG = _Obj.getLogger();

}

