package com.design.model.decorate.report;

/**
 *
 * 成绩单的抽象类
 *
 * @author FYF
 * @date 2022/9/27
 */
public abstract class SchoolReport {
	
	/**
	 * 成绩单主要展示的就是你的成绩情况
	 */
	public abstract void report();
	
	/**
	 * 成绩单要家长签字，这个是最要命的
	 * @param name 名字
	 */
	public abstract void sign(String name);
	
}