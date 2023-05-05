package com.design.model.factory;

import com.design.model.factory.human.Human;

/**
 * 抽象人类创建工厂
 *
 * @author fyf
 * @date 2022/7/11
 */
public abstract class AbstractHumanFactory {
	/**
	 * 传入参数为Class 且为 Human 的实现类
	 */
	public abstract <T extends Human> T createHuman(Class<T> C);
	
	/**
	 * 由颜色人类工厂自己的实现类
	 */
	public abstract Human createHuman();
}