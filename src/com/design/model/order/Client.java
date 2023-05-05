package com.design.model.order;

import com.design.model.order.command.Command;
import com.design.model.order.command.ConcertCommand1;
import com.design.model.order.command.DeletePageCommand;
import com.design.model.order.group.Group;
import com.design.model.order.group.PageGroup;
import com.design.model.order.group.RequirementGroup;
import com.design.model.order.invoker.Invoker;
import com.design.model.order.reciver.ConcertReceiver1;
import com.design.model.order.reciver.Receiver;

/**
 * @author ThinkPad
 * @date 2022/07/11 12:00
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("-------客户要求增加需求-------");
		Group rg = new RequirementGroup();
		rg.find();
		rg.add();
		rg.plan();
		
		System.out.println("-------客户要求删除页面-------");
		Group pg = new PageGroup();
		pg.find();
		pg.delete();
		pg.plan();
		/*-----------当有了执行者之后的代码*/
		
		System.out.println("-------当有了执行者之后的代码-------");
		Invoker pm = new Invoker();
		DeletePageCommand deletePageCommand = new DeletePageCommand();
		
		pm.setCommand(deletePageCommand);
		pm.action();
		
		Invoker xiaoSan = new Invoker(); //接头人就是小三
		//客户要求增加一项需求
		System.out.println("------------客户要求删除一个页面---------------");
		//客户给我们下命令来
		// Command command = new AddRequirementCommand();
		Command command = new DeletePageCommand();
		//接头人接收到命令
		xiaoSan.setCommand(command);
		
		//接头人执行命令
		xiaoSan.action();
		
		System.out.println("----------------有了 Receiver 之后的代码-------------");
		Invoker xiaosi = new Invoker();
		
		Receiver receiver = new ConcertReceiver1();
		Command concertCommand1 = new ConcertCommand1();
		xiaosi.setCommand(concertCommand1);
		xiaosi.action();
		
		System.out.println("完美 command  没有和 receiver 的耦合  无需考虑 receiver 对 执行的影响");
		xiaosi.setCommand(concertCommand1);
		xiaosi.action();
		
	}
}
