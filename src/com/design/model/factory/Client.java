package com.design.model.factory;

import com.design.model.factory.creator.ConcreteCreator1;
import com.design.model.factory.creator.Creator;
import com.design.model.factory.product.ConcreteProduct1;
import com.design.model.factory.product.Product;

/**
 * @author FYF
 * @date 2022/7/19
 */
public class Client {
	public static void main(String[] args) {
		
		Creator creator = new ConcreteCreator1();
		Product product = creator.createProduct(ConcreteProduct1.class);
		// 业务处理
		product.method1();
		product.method2();
	}
}