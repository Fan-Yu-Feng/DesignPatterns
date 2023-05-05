package com.design.model.decorate.components;

import com.design.model.decorate.report.SchoolReport;

/**
 * @author FYF
 * @date 2022/9/27
 */
public class HighScoreDecorator extends Decorator{
	/**
	 * 构造函数，传递成绩单过来
	 *
	 * @param sr 学校成绩单
	 */
	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
	}
	
	/**
	 * 我要汇报最高成绩
	 */
	private void reportHighScore(){
		System.out.println("这次考试语文最高是75，数学是78，自然是80");
	}
	
	/**
	 * 要在老爸看成绩单前告诉他最高成绩，否则等他一看，就抡起扫帚揍我，我哪里还有机会说啊
	 */
	@Override
	public void report(){
		this.reportHighScore();
		super.report();
	}
	
	
}