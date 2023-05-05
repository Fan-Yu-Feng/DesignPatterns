package com.design.model.factory.human;

/**
 * @author FYF @Description
 * @date 2022/7/11
 */
public class WhiteHuman implements Human {
	@Override
	public void getColor() {
		System.out.println("白色人种的皮肤颜色是白色的！");
	}
	
	@Override
	public void talk() {
		System.out.println("白人会说话，汉子。");
	}
	
	@Override
	public void getSex() {
	
	}
}
