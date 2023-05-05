package com.design.model.memorandum.example;

import com.design.model.memorandum.Memento;

import java.util.HashMap;

/**
 * @author FYF
 * @since 2022/12/12 15:51
 */
public class Caretaker {
	
	/**
	 * 多备份的备忘录容器
	 */
	private final HashMap<String, Memento> memMap = new HashMap<>();
	
	/**
	 * 发起人对象
	 */
	private Originator originator;
	private IMemento memento;
	
	public Originator getOriginator() {
		return originator;
	}
	
	public void setOriginator(Originator originator) {
		this.originator = originator;
	}
	
	public Memento getMemento(String idx) {
		return memMap.get(idx);
	}
	
	public void setMemento(String idx, Memento memento) {
		memMap.put(idx, memento);
	}
	
	public static void main(String[] args) {
		
		/*内存溢出问题，该备份一旦产生就装入内存，没有任何销毁的意向，这是非常危险的。
		因此，在系统设计时，要严格限定备忘录的创建，建议增加Map的上限，否则系统很容易产生内存溢出情况*/
		
		// 定义出发起人
		Originator originator = new Originator();
		// 定义出备忘录管理员
		Caretaker caretaker = new Caretaker();
		// 创建两个备忘录
		caretaker.setMemento("001", originator.createMemento());
		caretaker.setMemento("002", originator.createMemento());
		// 恢复一个指定标记的备忘录
		originator.restoreMemento(caretaker.getMemento("001"));
		
	}
	
}