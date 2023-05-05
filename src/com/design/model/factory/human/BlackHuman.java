package com.design.model.factory.human;

/**
 * @author FYF @Description
 * @date 2022/7/11
 */
public class BlackHuman implements Human {
	@Override
	public void getColor() {
		System.out.println("黑色人种的皮肤颜色是黑色的！");
	}
	
	@Override
	public void talk() {
		System.out.println("黑人会说话，一般人听不懂。");
	}
	
	@Override
	public void getSex() {
	
	}
}
