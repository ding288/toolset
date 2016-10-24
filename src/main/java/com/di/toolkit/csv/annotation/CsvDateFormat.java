package com.di.toolkit.csv.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
* @author  di: 
* @date 创建时间：2016年10月24日 下午10:59:57 
* @version
*/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CsvDateFormat {
	public abstract String pattern();
}
