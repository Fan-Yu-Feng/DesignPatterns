package com.design.model.singleton;

/**
 * @author FYF
 * @ 单例模式模板
 * @date 2022/7/10
 */
public class Singleton {
  private static final Singleton singleton = new Singleton();

  /** 限制产生多个对象 */
  private Singleton() {}

  /** 获取单个对象 */
  public static Singleton getSingleton() {
    return singleton;
  }

  /** 类中其他方法，尽量是static */
  public static void doSomething() {}
	
	/*
	 * 优点
	 * 1、单例模式在内存中只有一个实例，减少了内存开支，特别是一个对象需要频繁地 创建、销毁时，而且创建或销毁时性能又无法优化，单例模式的优势就非常明显。
	 * 2、单例模式可以避免对资源的多重占用
	 * 3、单例模式可以在系统设置全局的访问点，优化和共享资源访问，例如可以设计一个单 例类，负责所有数据表的映射处理
	 */
	
	/*
	 * 缺点
	 * 1、没有接口，难扩展，需要自行实例化，并提供单一实例、接口或抽象类是不可能呗实例化的。
	 * 2、对测试不利，单例模式没有完成，不能测试，没有接口也不能用mock的方式虚拟一个对象
	 * 3、单例模式与单一职责原则有冲突。一个类应该只实现一个逻辑，而不关心它是否是单
	 *    例的，是不是要单例取决于环境，单例模式把“要单例”和业务逻辑融合在一个类中。
	 */
}
