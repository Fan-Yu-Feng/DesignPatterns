package com.design.model.proxy.handle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的类
 *
 * @author FYF
 * @date 2022/8/28
 */
public class MyInvocationHandler  implements InvocationHandler {
	/**
	 * 被代理的对象
	 */
	private Object target;
	public MyInvocationHandler(Object obj){
		this.target = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(this.target, args);
	}
}