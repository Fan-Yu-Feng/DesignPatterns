package com.design.model.strategy.components;

/**
 * 找吴国太开绿灯
 *
 * @author FYF
 * @date 2022/9/30
 */
public class BlockEnemy implements IStrategy {
	@Override
	public void operate() {
		System.out.println("孙夫人断后，挡住追兵");
	}
}