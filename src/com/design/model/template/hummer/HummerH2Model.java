package com.design.model.template.hummer;

/**
 * H2 型号的悍马模型
 *
 * @author FYF
 * @date 2022/8/11
 */
public class HummerH2Model extends HummerModel {
	@Override
	public void start() {
		System.out.println("悍马H2发动...");
	}
	
	@Override
	public void stop() {
		System.out.println("悍马H2停车...");
	}
	
	@Override
	public void alarm() {
		System.out.println("悍马H2鸣笛...");
	}
	
	@Override
	public void engineBoom() {
		System.out.println("悍马H2引擎声音是这样的...");
	}
	
	@Override
	protected boolean isAlarm() {
		return false;
	}
}