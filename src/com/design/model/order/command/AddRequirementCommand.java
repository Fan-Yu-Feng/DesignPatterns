package com.design.model.order.command;

import com.design.model.order.reciver.ConcertReceiver1;
import com.design.model.order.reciver.Receiver;

/**
 * 新增需求
 *
 * @author FYF
 * @date 2022/7/8
 */
public class AddRequirementCommand extends Command {
	public AddRequirementCommand() {
		super(new ConcertReceiver1());
	}
	
	public AddRequirementCommand(Receiver receiver) {
		super(receiver);
	}
	
	/**
	 * 执行命令
	 */
	@Override
	public void execute() {
		// 找到需求组
		super.rg.find();
		// 添加需求
		super.rg.add();
		// 变更计划
		super.rg.plan();
	}
}
