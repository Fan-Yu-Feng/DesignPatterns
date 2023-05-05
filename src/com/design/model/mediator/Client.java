package com.design.model.mediator;

import com.design.model.mediator.manager.Purchase;
import com.design.model.mediator.manager.Sale;
import com.design.model.mediator.manager.Stock;

/**
 * @author FYF
 * @date 2022/9/11
 */
public class Client {
	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		
		// 采购人员采购电脑
		System.out.println("------采购人员采购电脑--------");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMComputer(100);
		//销售人员销售电脑
		System.out.println("\n------销售人员销售电脑--------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);
		//库房管理人员管理库存
		System.out.println("\n------库房管理人员清库处理--------");
		Stock stock = new Stock(mediator);
		stock.clearStock();
		
	}
}