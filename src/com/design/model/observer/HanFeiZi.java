package com.design.model.observer;

import java.util.Observable;

/**
 * 被观察的角色
 *
 * @author FYF
 * @version 1.0
 * @date 2022/10/9 12:45
 */
public class HanFeiZi extends Observable implements IHanFeiZi {
	
	private boolean isHavingBreakfast = false;
	private boolean isHavingFun = false;
	
	@Override
	public void haveBreakfast() {
		System.out.println("韩非子:开始吃饭了...");
		
		//通知所有的观察者
		super.setChanged();
		this.isHavingBreakfast = true;
	}
	
	@Override
	public void haveFun() {
		System.out.println("韩非子:开始娱乐了...");
		super.setChanged();
		this.isHavingFun = true;
	}
	
	
	public boolean isHavingBreakfast() {
		return isHavingBreakfast;
	}
	
	public void setHavingBreakfast(boolean havingBreakfast) {
		isHavingBreakfast = havingBreakfast;
	}
	
	public boolean isHavingFun() {
		return isHavingFun;
	}
	
	public void setHavingFun(boolean havingFun) {
		isHavingFun = havingFun;
	}
}