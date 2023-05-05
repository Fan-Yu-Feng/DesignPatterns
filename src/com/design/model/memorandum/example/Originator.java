package com.design.model.memorandum.example;

import com.design.model.memorandum.Memento;
import com.design.util.BeanUtils;

/**
 * 发起人角色
 *
 * @author FYF
 * @since 2022/12/12 15:49
 */
public class Originator implements Cloneable {
	private Originator backup;
	
	/**
	 * 内部状态
	 */
	private String state = "";
	private String state1 = "";
	private String state2 = "";
	private String state3 = "";
	
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * 创建一个备忘录
	 */
	public Memento createMemento() {
		this.backup = clone();
		return new Memento(BeanUtils.backupProp(this));
	}
	
	/**
	 * 恢复一个备忘录
	 */
	public void restoreMemento(Memento memento) {
		BeanUtils.restoreProp(this, memento.getStateMap());
	}
	
	@Override
	public Originator clone() {
		try {
			return (Originator) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getState1() {
		return state1;
	}
	
	public void setState1(String state1) {
		this.state1 = state1;
	}
	
	public String getState2() {
		return state2;
	}
	
	public void setState2(String state2) {
		this.state2 = state2;
	}
	
	public String getState3() {
		return state3;
	}
	
	public void setState3(String state3) {
		this.state3 = state3;
	}
	
	@Override
	public String toString() {
		return "Originator{" +
				       "state='" + state + '\'' +
				       ", state1='" + state1 + '\'' +
				       ", state2='" + state2 + '\'' +
				       ", state3='" + state3 + '\'' +
				       '}';
	}
	
	
}