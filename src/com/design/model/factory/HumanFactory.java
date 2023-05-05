package com.design.model.factory;

import com.design.model.factory.human.Human;

/**
 * @author fyf
 * @date 2022/7/11
 */
public class HumanFactory extends AbstractHumanFactory {
	
	/**
	 * 传入参数为Class 且为 Human 的实现类
	 */
	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			// 产生一个人种
			human = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("创建人种失败");
		}
		
		return (T) human;
	}
	
	/**
	 * 由颜色人类工厂自己的实现类
	 */
	@Override
	public Human createHuman() {
		return null;
	}
}