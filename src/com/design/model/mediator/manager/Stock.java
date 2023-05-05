package com.design.model.mediator.manager;

import com.design.model.mediator.AbstractMediator;

/**
 * 库存管理
 *
 * @author FYF
 * @date 2022/9/11
 */
public class Stock extends AbstractColleague {
	
	
	/**
	 * 刚开始有100台电脑 电脑数量
	 */
	private static int COMPUTER_NUMBER = 100;
	
	public Stock(AbstractMediator abstractMediator) {
		super(abstractMediator);
	}
	
	public Stock() {
	
	}
	
	/**
	 * 库存增加
	 *
	 * @param number 数量
	 */
	public void increase(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("库存数量为：" + COMPUTER_NUMBER);
	}
	
	/**
	 * 库存降低
	 *
	 * @param number 数量
	 */
	public void decrease(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("库存数量为：" + COMPUTER_NUMBER);
	}
	
	/**
	 * 获得库存数量
	 *
	 * @return 库存数量
	 */
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}
	
	/**
	 * 存货压力大了，就要通知采购人员不要采购，销售人员要尽快销售
	 */
	public void clearStock() {
		System.out.println("清理存货数量为：" + COMPUTER_NUMBER);
		// 清理库存
		super.mediator.execute("stock.clear");
	}
	
	
}