package org.doxer.app.base.thymeleaf.util;

import static com.github.hatimiti.flutist.common.util._Ref.*;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import lombok.val;

import org.dbflute.bhv.AbstractBehaviorWritable;
import org.dbflute.bhv.readable.CBCall;
import org.doxer.app.db.dbflute.exbhv.CmKaishaBhv;
import org.doxer.app.db.dbflute.exbhv.CmRenrakusakiYotoKbBhv;
import org.doxer.app.db.dbflute.exbhv.CmTesuryoKbBhv;
import org.doxer.app.db.dbflute.exentity.CmKaisha;
import org.doxer.xbase.util._Container;

import com.github.hatimiti.flutist.common.util._Num;


public class JUtility {

	public List<CmKaisha> cmKaishaList() {
		CmKaishaBhv bhv = _Container.getComponent(CmKaishaBhv.class).get();
		return bhv.selectList(cb -> {
				cb.query().addOrderBy_CmKaishaId_Asc();
			});
	}

	public CmKaisha cmKaisha(Object cmKaishaId) {
		CmKaishaBhv bhv = _Container.getComponent(CmKaishaBhv.class).get();
		return bhv.selectEntity(cb -> {
				cb.query().setCmKaishaId_Equal(_Num.asLongOrNull(cmKaishaId.toString()));
			}).get();
	}

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
