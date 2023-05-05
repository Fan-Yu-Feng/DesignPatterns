package com.design.model.mediator;

/**
 * 具体中介者
 * 中介者Mediator定义了多个private方法，其目的是处理各个对象之间的依赖关系，就是
 * 说把原有一个对象要依赖多个对象的情况移到中介者的private方法中实现
 *
 * @author FYF
 * @date 2022/9/11
 */
public class Mediator extends AbstractMediator {
	@Override
	public void execute(String str, Object... objects) {
		
		switch (str) {
			case "purchase.buy":
				//采购电脑
				this.buyComputer((Integer) objects[0]);
				break;
			case "sale.sell":
				//销售电脑
				this.sellComputer((Integer) objects[0]);
				break;
			case "sale.offsell":
				//折价销售
				this.offSell();
				break;
			case "stock.clear":
				//清仓处理
				this.clearStock();
				break;
			default:
				break;
		}
	}
	
	/**
	 * 采购电脑
	 *
	 * @param number 数量
	 */
	private void buyComputer(int number) {
		int saleStatus = super.sale.getSaleStatus();
		if (saleStatus > 80) {
			//销售情况良好
			System.out.println("采购IBM电脑:" + number + "台");
			super.stock.increase(number);
		} else {
			//销售情况不好
			int buyNumber = number / 2;
			//折半采购
			System.out.println("采购IBM电脑：" + buyNumber + "台");
		}
	}
	
	/**
	 * 销售电脑
	 *
	 * @param number 数量
	 */
	private void sellComputer(int number) {
		if (super.stock.getStockNumber() < number) {
			//库存数量不够销售
			super.purchase.buyIBMComputer(number);
		}
		super.stock.decrease(number);
	}
	
	/**
	 * 折价销售电脑
	 */
	private void offSell() {
		System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
	}
	
	/**
	 * 清仓处理
	 */
	private void clearStock() {
		//要求清仓销售
		super.sale.offSale();
		//要求采购人员不要采购
		super.purchase.refuseBuyIBM();
		
	}
}