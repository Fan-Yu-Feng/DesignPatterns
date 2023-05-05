package com.design.model.order.command;

import com.design.model.order.reciver.ConcertReceiver1;

/**
 * 删除页面
 *
 * @author FYF
 * @date 2022/7/8
 */
public class DeletePageCommand extends Command {
	public DeletePageCommand() {
		super(new ConcertReceiver1());
	}
	
	/**
	 * 执行命令
	 */
	@Override
	public void execute() {
		// 找到页面组
		super.pg.find();
		// 删除代码
		super.cg.delete();
		// 删除页面
		super.pg.delete();
		// 变更计划
		super.pg.plan();
	}
}
