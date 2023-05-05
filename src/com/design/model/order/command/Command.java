package com.design.model.order.command;

import com.design.model.order.group.CodeGroup;
import com.design.model.order.group.PageGroup;
import com.design.model.order.group.RequirementGroup;
import com.design.model.order.reciver.Receiver;

/**
 * 抽象命令类
 * 命令模式的定义：将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请
 * 求排队或者记录请求日志，可以提供命令的撤销和恢复功能。）
 * 优点：
 * ●类间解耦
 * 调用者角色与接收者角色之间没有任何依赖关系，调用者实现功能时只需调用Command
 * 抽象类的execute方法就可以，不需要了解到底是哪个接收者执行。
 * ●可扩展性
 * Command的子类可以非常容易地扩展，而调用者Invoker和高层次的模块Client不产生严
 * 重的代码耦合。
 * ● 命令模式结合其他模式会更优秀
 * 命令模式可以结合责任链模式，实现命令族解析任务；结合模板方法模式，则可以减少
 * Command子类的膨胀问题。
 * <p>
 * 命令模式也是有缺点的，请看Command的子类：如果有N个命令，问题就出来了，
 * Command的子类就可不是几个，而是N个，这个类膨胀得非常大，这个就需要读者在项目中慎重考虑使用。
 *
 * @author FYF
 * @date 2022/7/8
 */
public abstract class Command {
	
	/**
	 * 完美的 command 类 定义全局的命令接受者
	 * command父类中声明了一个接收者，通过构造函数约定每个具体命令都必须指定接收
	 * 者，当然根据开发场景要求也可以有多个接收者，那就需要用集合类型。
	 *
	 */
	protected final Receiver receiver;
	
	
	
	
	/**
	 * 定义好组 子类可以使用
	 */
	protected RequirementGroup rg = new RequirementGroup();
	protected PageGroup pg = new PageGroup();
	protected CodeGroup cg = new CodeGroup();
	
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}
	
	/**
	 * 执行命令
	 */
	public abstract void execute();
	
	
}
