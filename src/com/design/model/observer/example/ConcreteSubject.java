package com.design.model.observer.example;

/**
 * @author FYF
 * @date 2022/11/6
 */
public class ConcreteSubject extends Subject {
	
	/**
	 * 具体的业务
	 */
	public void doSomething(){
		/*
		 * do something
		 */
		super.notifyObservers();
	}
}