package com.design.model.decorate.report;

/**
 * 四年级的成绩单
 *
 * @author FYF
 * @date 2022/9/27
 */
public class FourthGradeSchoolReport extends SchoolReport {
	@Override
	public void report() {
		//成绩单的格式是这个样子的
		System.out.println("尊敬的XXX家长:");
		System.out.println(" ......");
		System.out.println(" 语文 62 数学65 体育 98 自然 63");
		System.out.println(" .......");
		System.out.println(" 家长签名： ");
		
	}
	
	@Override
	public void sign(String name) {
		System.out.println("家长的名字为： " + name);
	}
}