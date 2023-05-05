package com.design.model.adapter.example;

/**
 * 适配器角色
 *
 * @author FYF
 * @date 2022/10/2
 */
public class Adapter extends Adaptee implements Target {
	@Override
	public void request() {
		super.doSomething();
	}
}