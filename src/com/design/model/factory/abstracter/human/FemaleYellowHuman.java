package com.design.model.factory.abstracter.human;

import com.design.model.factory.abstracter.AbstractYellowHuman;

/**
 * @author FYF
 * @date 2022/8/6
 */
public class FemaleYellowHuman extends AbstractYellowHuman {
	/**
	 * 黄人女性
	 */
	@Override
	public void getSex() {
		System.out.println("黄人女性");
	}
}