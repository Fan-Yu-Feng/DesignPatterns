package com.design.model.decorate.components;

import com.design.model.decorate.report.SchoolReport;

/**
 * @author FYF
 * @date 2022/9/27
 */
public class SortDecorator extends Decorator{
	/**
	 * 构造函数，传递成绩单过来
	 *
	 * @param sr 学校成绩单
	 */
	public SortDecorator(SchoolReport sr) {
		super(sr);
	}
	
	/**
	 * 告诉老爸学校的排名情况
	 */
	private void reportSort(){
		System.out.println("我是排名第38名...");
	}
	
	/**
	 * 老爸看完成绩单后再告诉他，加强作用
	 */
	@Override
	public void report(){
		super.report();
		this.reportSort();
	}
	
	
	
}