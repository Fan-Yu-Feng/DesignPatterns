package com.design.model.mediator.manager;

import com.design.model.mediator.AbstractMediator;

/**
 * 采购管理
 *
 * @author FYF
 * @date 2022/9/11
 */
public class Purchase extends AbstractColleague {
	public Purchase(AbstractMediator abstractMediator) {
		super(abstractMediator);
	}
	
	public Purchase() {
	}
	
	
	/**
	 * 采购IBM电脑
	 *
	 * @param number 数量
	 */
	public void buyIBMComputer(int number) {
		// 使用中介者模式购买电脑
		super.mediator.execute("purchase.buy", number);
		
		// //访问库存
		// Stock stock = new Stock();
		// //访问销售
		// Sale sale = new Sale();
		// //电脑的销售情况
		// int saleStatus = sale.getSaleStatus();
		// if (saleStatus > 80) {
		// 	//销售情况良好
		// 	System.out.println("采购IBM电脑:" + number + "台");
		// 	stock.increase(number);
		// } else {
		// 	//销售情况不好
		// 	//折半采购
		// 	int buyNumber = number / 2;
		// 	System.out.println("采购IBM电脑：" + buyNumber + "台");
		// }
	}
	
	/**
	 * 不再采购IBM电脑
	 */
	public void refuseBuyIBM() {
		System.out.println("不再采购IBM电脑");
	}
	
}