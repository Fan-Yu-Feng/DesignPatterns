package com.design.model.template.hummer;

/**
 * H1 型号的悍马模型
 *
 * @author FYF
 * @date 2022/8/11
 */
public class HummerH1Model extends HummerModel {
	/**
	 * 是否响喇叭
	 */
	private boolean alarmFlag = true;
	
	@Override
	public void start() {
		System.out.println("悍马H1发动...");
	}
	
	@Override
	public void stop() {
		System.out.println("悍马H1停车...");
	}
	
	@Override
	public void alarm() {
		System.out.println("悍马H1鸣笛...");
	}
	
	@Override
	public void engineBoom() {
		System.out.println("悍马H1引擎声音是这样的...");
	}
	
	/**
	 * 自定义是否需要响喇叭
	 */
	@Override
	protected boolean isAlarm() {
		return this.alarmFlag;
	}
	
	/**
	 * 要不要响喇叭，是由客户来决定的
	 */
	public void setAlarm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}
}