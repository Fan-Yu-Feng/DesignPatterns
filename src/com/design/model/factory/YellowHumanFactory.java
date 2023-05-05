package com.design.model.factory;

import com.design.model.factory.human.Human;
import com.design.model.factory.human.YellowHuman;

/**
 * @author FYF
 * @date 2022/7/19
 */
public class YellowHumanFactory extends AbstractHumanFactory {
	/**
	 * 传入参数为Class 且为 Human 的实现类
	 */
	@Override
	public <T extends Human> T createHuman(Class<T> C) {
		return null;
	}
	
	/**
	 * 由颜色人类工厂自己的实现类
	 */
	@Override
	public Human createHuman() {
		return new YellowHuman();
	}
}