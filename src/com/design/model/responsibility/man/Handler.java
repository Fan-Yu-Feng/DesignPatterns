package com.design.model.responsibility.man;

import com.design.model.responsibility.women.IWomen;

/**
 * 使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关
 * 系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。
 * <p>
 * 责任链模式的重点是在“链”上，由一条链去处理相似的请求在链中决定谁来处理这个请
 * 求，并返回相应的结果。
 * 抽象的处理者实现三个职责：
 * 一是定义一个请求的处理方法handleMessage，唯一对外开
 * 放的方法；
 * 二是定义一个链的编排方法setNext，设置下一个处理者；
 * 三是定义了具体的请求
 * 者必须实现的两个方法：定义自己能够处理的级别getHandlerLevel和具体的处理任务echo。
 *
 * @author FYF
 * @date 2022/9/20
 */
public abstract class Handler {
	/**
	 * 请求类型
	 */
	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;
	
	
	/**
	 * 能处理的级别
	 */
	private int level;
	/**
	 * 责任传递，下一个人责任人是谁
	 */
	private Handler nextHandler;
	
	/**
	 * 构建 handler 时指定能处理的级别
	 *
	 * @param level 处理级别
	 */
	public Handler(int level) {
		this.level = level;
	}
	
	/**
	 * 一个女性（女儿、妻子或者是母亲）要求逛街，你要处理这个请求
	 *
	 * @param women 女性
	 */
	public final void handleMessage(IWomen women) {
		if (women.getType() == this.level) {
			this.response(women);
		} else {
			if (this.nextHandler != null) {
				//有后续环节，才把请求往后递送
				this.nextHandler.handleMessage(women);
			} else {
				//已经没有后续处理人了，不用处理了
				System.out.println("---没地方请示了，按不同意处理---\n");
			}
		}
	}
	
	/**
	 * 如果不属于你处理的请求，你应该让她找下一个环节的人，如女儿出嫁了，
	 * 还向父亲请示是否可以逛街，那父亲就应该告诉女儿，应该找丈夫请示
	 *
	 * @param handler 处理人
	 */
	public void setNext(Handler handler) {
		this.nextHandler = handler;
	}
	
	/**
	 * 对请示的回应
	 *
	 * @param women 女性
	 */
	protected abstract void response(IWomen women);
	
	
	
	
}