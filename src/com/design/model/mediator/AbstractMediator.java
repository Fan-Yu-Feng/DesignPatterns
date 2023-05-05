package com.design.model.mediator;

import com.design.model.mediator.manager.Purchase;
import com.design.model.mediator.manager.Sale;
import com.design.model.mediator.manager.Stock;

/**
 * 抽象中介
 * <p>
 * 中介者模式定义（用一个中介对象封装一系列的对象
 * 交互，中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变它
 * 们之间的交互。）
 * <p>
 * 优点：中介者模式的优点就是减少类间的依赖，把原有的一对多的依赖变成了一对一的依赖，
 * 同事类只依赖中介者，减少了依赖，当然同时也降低了类间的耦合。
 * <p>
 * 缺点：中介者会膨胀得很大，而且逻辑复杂，原本N个对象直接的相互
 * 依赖关系转换为中介者和同事类的依赖关系，同事类越多，中介者的逻辑就越复杂
 * <p>
 * 适用情况：多个类紧密耦合的情况，
 * 紧密耦合的标准是：在类图中出现了蜘蛛网状结构。在这种情况下一定要考虑使用中介者模式，
 * 这有利于把蜘蛛网梳理为星型结构，使原本复杂混乱的关系变得清晰简单
 * <p>
 * 实际应用：
 * 1、机场调度中心：“××机场调度中心”，它就是具体的中介者，用来调度每
 * 一架要降落和起飞的飞机。
 * 2、MVC 框架
 * MVC框架，其中的C（Controller）就是一个中介者，叫做前端控制器(Front Controller)，
 * 它的作用就是把M(Model，业务逻辑)和V（View，视图）隔离开，
 * 协调M和V协同工作，把M运行的结果和V代表的视图融合成一个前端可以展示的页面，减少M和V的依赖关系。
 *
 * @author FYF
 * @date 2022/9/11
 */
public abstract class AbstractMediator {
	
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;
	
	//构造函数
	public AbstractMediator() {
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}
	
	/**
	 * 中介者最重要的方法叫做事件方法，处理多个对象之间的关系
	 *
	 * @param str     srt
	 * @param objects obj
	 */
	public abstract void execute(String str, Object... objects);
	
	
}