package org.doxer.app.base.thymeleaf.util;

import static com.github.hatimiti.flutist.common.util._Ref.*;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import lombok.val;

import org.dbflute.bhv.AbstractBehaviorWritable;
import org.dbflute.bhv.readable.CBCall;
import org.doxer.app.db.dbflute.exbhv.CmRenrakusakiYotoKbBhv;
import org.doxer.app.db.dbflute.exbhv.CmTesuryoKbBhv;
import org.doxer.xbase.util._Container;


public class JUtility {

	public Map<Object, Object> tesuryoKb() {
		return createKbMap(CmTesuryoKbBhv.class);
	}

	public Map<Object, Object> renrakusakiYotoKb() {
		return createKbMap(CmRenrakusakiYotoKbBhv.class);
	}

	private Map<Object, Object> createKbMap(
			Class<? extends AbstractBehaviorWritable<?, ?>> bhvClass) {
		val resultMap = new TreeMap<>();
		val bhv = _Container.getComponent(bhvClass).get();
		((List<?>) invoke(getMethod(bhvClass, "selectList", CBCall.class).get(),
			bhv, (CBCall<?>) scb -> {})).forEach(kb -> {
				resultMap.put(
						invoke(getMethod(kb.getClass(), "getKbVal").get(), kb),
						invoke(getMethod(kb.getClass(), "getKbMei").get(), kb));
			});
		return resultMap;
	}

}
