package com.design.model.memorandum;

/**
 * 备忘录管理类-负责管理备忘录
 *
 * @author FYF
 * @since 2022/12/12 15:34
 */
public class Caretaker {
	/**
	 * 备忘录对象
	 */
	private Memento memento;
	
	public Memento getMemento() {
		return memento;
	}
	
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}