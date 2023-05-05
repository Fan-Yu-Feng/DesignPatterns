package com.design.model.memorandum;

import com.design.model.memorandum.example.Originator;

/**
 * 备忘录模式定义：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
 * <p>
 * 使用场景：
 * ● 需要保存和恢复数据的相关状态场景。
 * <p>
 * ● 提供一个可回滚（rollback）的操作；比如Word中的CTRL+Z组合键，IE浏览器中的后
 * 退按钮，文件管理器上的backspace键等。
 * <p>
 * ● 需要监控的副本场景中。例如要监控一个对象的属性，但是监控又不应该作为系统的主业务来调用，它只是边缘应用，
 * 即使出现监控不准、错误报警也影响不大，因此一般的做法是备份一个主线程中的对象，然后由分析程序来分析。
 * <p>
 * ● 数据库连接的事务管理就是用的备忘录模式，想想看，如果你要实现一个JDBC驱
 * 动，你怎么来实现事务？还不是用备忘录模式嘛！
 * <p>
 * 注意事项
 * ● 备忘录的生命期
 * 备忘录创建出来就要在“最近”的代码中使用，要主动管理它的生命周期，建立就要使
 * 用，不使用就要立刻删除其引用，等待垃圾回收器对它的回收处理。
 * <p>
 * ● 备忘录的性能
 * 不要在频繁建立备份的场景中使用备忘录模式（比如一个for循环中），原因有二：一是
 * 控制不了备忘录建立的对象数量；二是大对象的建立是要消耗资源的，系统的性能需要考
 * 虑。因此，如果出现这样的代码，设计师就应该好好想想怎么修改架构了。
 * <p>
 * 扩展：clone方式的备忘录、多状态的备忘录模式map<String,Object>、多备份的备忘录 map<String,Memento>
 *
 * @author FYF
 * @since 2022/12/12 15:21
 */
public class Client {
	
	public static void main(String[] args) {
		// 声明出主角
		Boy boy = new Boy();
		// 初始化当前状态
		boy.setState("心情很棒！");
		System.out.println("=====男孩现在的状态======");
		System.out.println(boy.getState());
		// 需要记录下当前状态呀
		Boy backup = new Boy();
		backup.setState(boy.getState());
		// 男孩去追女孩，状态改变
		boy.changeState();
		System.out.println("\n=====男孩追女孩子后的状态======");
		System.out.println(boy.getState());
		// 追女孩失败，恢复原状
		boy.setState(backup.getState());
		System.out.println("\n=====男孩恢复后的状态======");
		System.out.println(boy.getState());
		
		System.out.println("==========有了备份后==========");
		
		// 初始化当前状态
		boy.setState("心情很棒！");
		System.out.println("=====男孩现在的状态======");
		System.out.println(boy.getState());
		//需要记录下当前状态呀
		Memento mem = boy.createMemento();
		//男孩去追女孩，状态改变
		boy.changeState();
		System.out.println("\n=====男孩追女孩子后的状态======");
		System.out.println(boy.getState());
		//追女孩失败，恢复原状
		boy.restoreMemento(mem);
		System.out.println("\n=====男孩恢复后的状态======");
		System.out.println(boy.getState());
		
		System.out.println("===============使用备份管理器===================");
		
		Caretaker caretaker = new Caretaker();
		boy.setState("心情很棒！");
		System.out.println("=====男孩现在的状态======");
		System.out.println(boy.getState());
		//需要记录下当前状态呀
		// 创建一个备份
		caretaker.setMemento(boy.createMemento());
		//男孩去追女孩，状态改变
		boy.changeState();
		System.out.println("\n=====男孩追女孩子后的状态======");
		System.out.println(boy.getState());
		//追女孩失败，恢复原状
		boy.restoreMemento(caretaker.getMemento());
		System.out.println("\n=====男孩恢复后的状态======");
		System.out.println(boy.getState());
		
		
		System.out.println("===============场景demo--继承了克隆模式--多状态===================");
		//定义发起人
		Originator originator = new Originator();
		//建立初始状态
		originator.setState("初始状态...");
		originator.setState1("中国");
		originator.setState2("强盛");
		originator.setState3("繁荣");
		System.out.println("初始状态是：" + originator);
		//建立备份
		caretaker.setMemento(originator.createMemento());
		//修改状态
		originator.setState("修改后的状态...");
		originator.setState1("软件");
		originator.setState2("架构");
		originator.setState3("优秀");
		System.out.println("修改后状态是：" + originator);
		//恢复原有状态
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("恢复后状态是：" + originator);
	}
	
}