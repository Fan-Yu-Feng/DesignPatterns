package com.design.model.observer.example;

/**
 * @author FYF
 * @date 2022/11/6
 */
public class ConcreteObserver implements Observer {
	@Override
	public void update() {
		System.out.println("接受到消息，开始处理！");
	}
}