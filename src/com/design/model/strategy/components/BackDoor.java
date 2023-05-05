package com.design.model.strategy.components;

/**
 * 找乔国老开后门
 *
 * @author FYF
 * @date 2022/9/30
 */
public class BackDoor implements IStrategy {
	@Override
	public void operate() {
		System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
	}
}