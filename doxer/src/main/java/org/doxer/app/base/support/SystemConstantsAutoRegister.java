package org.doxer.app.base.support;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;

import org.doxer.app.db.dbflute.allcommon.CDef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.github.hatimiti.flutist.common.support.ConstantsAutoRegister;


/**
 * @author hatimiti
 */
@Component
public class SystemConstantsAutoRegister extends ConstantsAutoRegister
		implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private ServletContext application;

	@Override
	protected List<TargetClassInfo> getAdditionalClassPatterns() {
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
		tciList.add(new TargetClassInfo(CDef.class, ".*"));
		return tciList;
	}

	@Override
	protected List<Class<?>> getAdditionalTargetTypes() {
		List<Class<?>> targetTypes = new ArrayList<>();
		Arrays.stream(CDef.class.getClasses()).forEach(targetTypes::add);
		return targetTypes;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Arrays.stream(CDef.class.getClasses())
			.forEach(c -> register(application, c.getName()));
	}

}
