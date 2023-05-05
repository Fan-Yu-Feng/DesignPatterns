package com.design.model.factory.abstracter;

import com.design.model.factory.human.Human;

/**
 * 抽象工厂模式-黑色人种
 * @author FYF
 * @date 2022/8/6
 */
public abstract class AbstractBlackHuman implements Human {
	/**
	 * 黑色人种的皮肤颜色是黑色的
	 */
	@Override
	public void getColor(){
		System.out.println("黑色人种的皮肤颜色是黑色的！");
	}
	
	/**
	 * 黑色人种讲话
	 */
	@Override
	public void talk() {
		System.out.println("黑色人种会说话，一般说的都是单字节。");
	}
}