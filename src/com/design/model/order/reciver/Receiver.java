package com.design.model.order.reciver;

/**
 * 抽象接受者定义每个接受者必须要完成的任务
 * 该角色是属于干活的角色。如本例子中的 美工组、代码组、页面组等对象
 *
 * @author FYF
 * @date 2022/7/10
 */

public abstract class Receiver {
	
	
	
	/**
	 * 执行动作，命令传递到这里是执行动作
	 */
	public abstract void doSomeThing();
	
}