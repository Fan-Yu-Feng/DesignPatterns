package com.design.model.order.command;

import com.design.model.order.reciver.ConcertReceiver1;
import com.design.model.order.reciver.Receiver;

/**
 * 具体命令类 1
 *
 * @author FYF
 * @date 2022/7/10
 */

public class ConcertCommand1 extends Command {
	
	public ConcertCommand1() {
		super(new ConcertReceiver1());
	}
	
	public ConcertCommand1(Receiver receiver) {
		super(receiver);
	}
	
	@Override
	public void execute() {
		super.receiver.doSomeThing();
	}
}