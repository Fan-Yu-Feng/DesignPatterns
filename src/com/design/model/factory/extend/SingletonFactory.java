package com.design.model.factory.extend;

import com.design.model.singleton.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 负责生成单例的工厂
 *
 * @author FYF
 * @date 2022/7/13
 */
public class SingletonFactory {
	private static Singleton singleton;
	
	static {
		try {
			Class c1 = Class.forName(Singleton.class.getName());
			// 获得无参构造
			Constructor constructor = c1.getConstructor();
			// 设置无参构造是可以访问的
			constructor.setAccessible(true);
			// 产生一个实例对象
			Singleton singleton = (Singleton) constructor.newInstance();
		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 提供单例接口，提供外部访问，保证内存只有一个单例对象
	 */
	public static Singleton getSingleton() {
		return singleton;
	}
	
}