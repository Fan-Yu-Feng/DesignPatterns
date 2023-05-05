package com.design.model.factory.creator;

import com.design.model.factory.product.Product;

/**
 * @author FYF
 * @date 2022/7/19
 */
public class ConcreteCreator1 extends Creator {
	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		Product product = null;
		try {
			product = (Product) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) product;
	}
}