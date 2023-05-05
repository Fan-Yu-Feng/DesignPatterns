package com.design.model.proxy;

import com.design.model.proxy.advice.BeforeAdvice;
import com.design.model.proxy.handle.MyInvocationHandler;
import com.design.model.proxy.subject.RealSubject;
import com.design.model.proxy.subject.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 * 要实现动态代理的首要条件是：被代理类必须实现一个接口
 *
 * @author FYF
 * @date 2022/8/28
 */
public class DynamicProxy<T> {

	
	
	public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler handler) {
		//寻找JoinPoint连接点，AOP框架使用元数据定义
		//	 执行前置通知
		new BeforeAdvice().exec();
		return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
	}
	
	
	public static void main(String[] args) {
		Subject subject = new RealSubject();
		InvocationHandler handler = new MyInvocationHandler(subject);
		Subject proxy = DynamicProxy.newProxyInstance(Subject.class.getClassLoader(),Subject.class.getInterfaces(),handler);
		proxy.doSomeThing("代理做事情");
	}
}