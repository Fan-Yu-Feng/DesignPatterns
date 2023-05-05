package com.design.model.memorandum;

import com.design.model.memorandum.example.IMemento;

import java.util.HashMap;

/**
 * 备忘录-负责状态的保存和备份
 *
 * @author FYF
 * @since 2022/12/12 15:24
 */
public class Memento implements IMemento {
	private String state;
	
	/**
	 * 接受 hashMap 作为状态
	 */
	private HashMap<String, Object> stateMap;
	
	public Memento(String state) {
		this.state = state;
	}
	
	/**
	 * 接受一个对象，建立一个备份
	 */
	public Memento(HashMap<String, Object> map) {
		this.stateMap = map;
	}
	
	public HashMap<String, Object> getStateMap() {
		return stateMap;
	}
	
	public void setStateMap(HashMap<String, Object> stateMap) {
		this.stateMap = stateMap;
	}
	
	
	public String getState() {
		return state;
	}
	
	
	public void setState(String state) {
		this.state = state;
	}
}