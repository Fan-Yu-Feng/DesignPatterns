package com.design.model.factory.creator;

import com.design.model.factory.product.Product;

/**
 * 抽象工厂类，负责产品对象的产生
 *
 * @author FYF
 * @date 2022/7/19
 */
public abstract class Creator {
	
	/*
	 * 创建一个产品对象，其输入参数类型可以自行设置
	 * 通常为String、Enum、Class等，当然也可以为空
	 */
	public abstract <T extends Product> T createProduct(Class<T> c);
	
}