package org.doxer.app.base.support;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.doxer.app.db.dbflute.allcommon.CDef;

import com.github.hatimiti.flutist.common.support.ConstantsAutoRegister;

/**
 * @author m-kakimi
 */
public class SystemConstantsAutoRegister extends ConstantsAutoRegister {

	public SystemConstantsAutoRegister(ServletContext application) {
		super(application);
	}

	@Override
	protected List<TargetClassInfo> getClassPatternList() {
		List<TargetClassInfo> tciList = new ArrayList<TargetClassInfo>();
		/*
		 * 第1引数は探索するパッケージに属する class
		 * 第2引数は正規表現で実際に登録する class を指定する．
		 */
//		tciList.add(new TargetClassInfo(_DB.class, "_DB"));
//		tciList.add(new TargetClassInfo(_DB.class, ".*Column"));
//		tciList.add(new TargetClassInfo(SystemConstants.class, "SystemConstants"));
//		tciList.add(new TargetClassInfo(Constants.class, "Constants"));
		tciList.add(new TargetClassInfo(CDef.class, "CDef"));
//		tciList.add(new TargetClassInfo(CDef.class, ".*"));
		return tciList;
	}

	@Override
	protected void processBefore(Class<?> clazz) {

		if (clazz.isAssignableFrom(CDef.class)) {
			for (Class<?> innerClazz : clazz.getClasses()) {
				registTargetFields(innerClazz);
			}
		}
	}

	@Override
	protected void addTargetTypes(List<Class<?>> targetTypes) {
		for (Class<?> innerClazz : CDef.class.getClasses()) {
			targetTypes.add(innerClazz);
		}
	}

}
