package com.design.model.factory.extend;

import com.design.model.factory.product.ConcreteProduct1;
import com.design.model.factory.product.ConcreteProduct2;
import com.design.model.factory.product.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * 延迟加载的工厂类
 * 定义一个 Map 容器容纳所有产生的对象，根据产生的类型放入容器中，以便下次使用
 * 扩展：可以设置最大数量等
 *
 * @author FYF
 * @date 2022/7/13
 */
public class ProductFactory {
	private static final Map<String, Product> prMap = new HashMap();
	
	public static synchronized Product createProduct(String type) {
		Product product;
		//如果Map中已经有这个对象
		if (prMap.containsKey(type)) {
			product = prMap.get(type);
		} else {
			if (type.equals("Product1")) {
				product = new ConcreteProduct1();
			} else {
				product = new ConcreteProduct2();
			}
			//同时把对象放到缓存容器中
			prMap.put(type, product);
		}
		return product;
	}
}