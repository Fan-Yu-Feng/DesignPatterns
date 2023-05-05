package com.design.model.mediator.manager;

import com.design.model.mediator.AbstractMediator;

import java.util.Random;

/**
 * 销售管理
 *
 * @author FYF
 * @date 2022/9/11
 */
public class Sale extends AbstractColleague {
	public Sale(AbstractMediator abstractMediator) {
		super(abstractMediator);
	}
	
	public Sale() {
	}
	
	/**
	 * 销售电呢
	 *
	 * @param number 数量
	 */
	public void sellIBMComputer(int number) {
		super.mediator.execute("sale.sell", number);
		System.out.println("使用中介模式  销售IBM电脑" + number + "台");
		
		// Stock stock = new Stock();
		// //访问采购
		// Purchase purchase = new Purchase();
		// if (stock.getStockNumber() < number) {
		// 	//库存数量不够销售
		// 	purchase.buyIBMComputer(number);
		// }
		// System.out.println("销售IBM电脑" + number + "台");
		// stock.decrease(number);
	}
	
	/**
	 * 反馈销售情况，0～100之间变化，0代表根本就没人卖，100代表非常畅销，出一个卖一个
	 *
	 * @return 销售数量
	 */
	public int getSaleStatus() {
		Random rand = new Random(System.currentTimeMillis());
		int saleStatus = rand.nextInt(100);
		System.out.println("IBM电脑的销售情况为：" + saleStatus);
		return saleStatus;
	}
	
	/**
	 * 折价处理
	 */
	public void offSale() {
		System.out.println("中介折价处理");
		super.mediator.execute("sale.offsell");
		
		//库房有多少卖多少
		// Stock stock = new Stock();
		// System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
	}
}

