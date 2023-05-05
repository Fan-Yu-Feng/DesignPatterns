package com.design.model.builder.car;

/**
 * @author FYF
 * @date 2022/8/13
 */
public class BmwModel extends CarModel {
	@Override
	public void start() {
		System.out.println("宝马车跑起来是这个样子的...");
	}
	
	@Override
	public void stop() {
		System.out.println("宝马车应该这样停车...");
	}
	
	@Override
	public void alarm() {
		System.out.println("宝马车的喇叭声音是这个样子的...");
	}
	
	@Override
	public void engineBoom() {
		System.out.println("宝马车的引擎是这个声音的...");
	}
}