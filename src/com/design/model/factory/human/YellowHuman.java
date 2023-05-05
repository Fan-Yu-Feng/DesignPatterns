package com.design.model.factory.human;

/**
 * @author FYF @Description
 * @date 2022/7/11
 */
public class YellowHuman implements Human {
	@Override
	public void getColor() {
		System.out.println("黄色人种的皮肤颜色是黄色的！");
	}
	
	@Override
	public void talk() {
		System.out.println("黄人会说话，汉子。");
	}
	
	@Override
	public void getSex() {
	
	}
}
