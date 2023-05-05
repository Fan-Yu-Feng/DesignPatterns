package com.design.model.observer;

import com.design.model.observer.example.ConcreteObserver;
import com.design.model.observer.example.ConcreteSubject;

/**
 * 优点：
 * 1、观察者和被观察者之间是抽象耦合
 * 2、建立一套触发机制
 * <p>
 * 缺点：
 * 观察者模式需要考虑一下开发效率和运行效率问题，一个被观察者，多个观察者，开发
 * 和调试就会比较复杂，而且在Java中消息的通知默认是顺序执行，一个观察者卡壳，会影响
 * 整体的执行效率。在这种情况下，一般考虑采用异步的方式。
 *
 * @author FYF
 * @version 1.0
 * @date 2022/10/9 12:52
 */
public class Client {
	
	public static void main(String[] args) throws InterruptedException {
		
		//定义出韩非子和李斯
		LiSi liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		//观察早餐
		Spy watchBreakfast = new Spy(hanFeiZi, liSi, "breakfast");
		//开始启动线程，监控
		watchBreakfast.start();
		//观察娱乐情况
		Spy watchFun = new Spy(hanFeiZi, liSi, "fun");
		watchFun.start();
		//然后我们看看韩非子在干什么
		//主线程等待1秒后后再往下执行
		Thread.sleep(1000);
		hanFeiZi.haveBreakfast();
		//韩非子娱乐了
		Thread.sleep(1000);
		hanFeiZi.haveFun();
		
		
		ConcreteSubject concreteSubject = new ConcreteSubject();
		
		ConcreteObserver concreteObserver = new ConcreteObserver();
		
		concreteSubject.addObserver(concreteObserver);
		concreteSubject.doSomething();
	}
}