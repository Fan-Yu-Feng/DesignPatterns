package com.design.model.order.invoker;

import com.design.model.order.command.Command;

/**
 * 负责人：接受命令，执行命令
 *
 * @author FYF
 * @date 2022/7/8
 */
public class Invoker {
	public Command getCommand() {
		return command;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	/**
	 * 命令
	 */
	private Command command;
	
	/**
	 * 执行命令
	 */
	public void action() {
		this.command.execute();
	}
}
