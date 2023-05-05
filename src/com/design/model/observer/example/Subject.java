package com.design.model.observer.example;

import java.util.Vector;

/**
 * 被观察者
 *
 * @author FYF
 * @date 2022/11/6
 */
public abstract class Subject {
	/**
	 * 定义一个观察者数组
	 */
	private Vector<Observer> obsVector = new Vector<>();
	
	/**
	 * 增加一个观察者
	 * @param o 观察者
	 */
	public void addObserver(Observer o){
		this.obsVector.add(o);
	}
	
	/**
	 * 删除一个观察者
	 * @param o 观察者
	 */
	public void delObserver(Observer o){
		this.obsVector.remove(o);
	}
	
	/**
	 * 通知所有观察者
	 */
	public void notifyObservers(){
		for(Observer o:this.obsVector){
			o.update();
		}
	}
}