package org.doxer.xbase.util;

import static com.github.hatimiti.flutist.common.util._Ref.*;
import static com.github.hatimiti.flutist.common.util._Regex.*;

import java.util.Properties;
import java.util.regex.Pattern;

import lombok.val;

public class BeanProperties extends Properties {

	public String getModeledProperty(String key, Object bean) {
		val mes = getProperty(key);
		return replace(mes, bean);
	}

	public static String replace(String mes, Object bean) {
		val result = new StringBuffer();
		val matcher = Pattern.compile("\\$\\{(.+?)\\}").matcher(mes);
		
		while (matcher.find()) {
			String repstr = matcher.group();
			val f = getFieldValueByName(bean, matcher.group(1));
			if (f.isPresent()) {
				repstr = f.get().toString();
			}
			matcher.appendReplacement(result, escape(repstr));
		}
		
		return result.toString();
	}

}
