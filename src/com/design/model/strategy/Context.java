package com.design.model.strategy;

import com.design.model.strategy.components.IStrategy;

/**
 * Context 封装类 也就是锦囊 承装策略。
 * 上下文角色，起承上启下封装作用，屏蔽高层模块对策略、算法的直接访问，封装可能存在的变化。
 *
 * @author FYF
 * @date 2022/9/30
 */
public class Context {
	
	/**
	 *
	 */
	private final IStrategy iStrategy;
	public Context(IStrategy iStrategy) {
		this.iStrategy = iStrategy;
	}
	
	public void operate(){
		this.iStrategy.operate();
	}
	
}