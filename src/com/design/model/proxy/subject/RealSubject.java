package com.design.model.proxy.subject;

/**
 * @author FYF
 * @date 2022/8/28
 */
public class RealSubject implements Subject{

	@Override
	public void doSomeThing(String string) {
		System.out.println("do something!---->" + string);
	}
}