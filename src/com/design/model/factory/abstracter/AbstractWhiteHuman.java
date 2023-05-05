package com.design.model.factory.abstracter;

import com.design.model.factory.human.Human;

/**
 * 抽象工厂模式-白色人种
 * @author FYF
 * @date 2022/8/6
 */
public abstract class AbstractWhiteHuman implements Human {
	/**
	 * 白色人种的皮肤颜色是白色的
	 */
	@Override
	public void getColor(){
		System.out.println("白色人种的皮肤颜色是白色的！");
	}
	
	/**
	 * 白色人种讲话
	 */
	@Override
	public void talk() {
		System.out.println("白色人种会说话，一般说的都是单字节。");
	}
}