package com.design.model.proxy.subject;

import com.design.model.proxy.DynamicProxy;
import com.design.model.proxy.handle.MyInvocationHandler;

import java.lang.reflect.InvocationHandler;

/**
 * 具体的业务动态代理类
 *
 * @author FYF
 * @date 2022/8/28
 */
public class SubjectDynamicProxy  extends DynamicProxy<Subject> {
	
	public static <T> T newProxyInstance(Subject subject){
		//获得ClassLoader
		ClassLoader loader = subject.getClass().getClassLoader();
		//获得接口数组
		Class<?>[] classes = subject.getClass().getInterfaces();
		//获得handler
		InvocationHandler handler = new MyInvocationHandler(subject);
		return newProxyInstance(loader, classes, handler);
	}
	
}