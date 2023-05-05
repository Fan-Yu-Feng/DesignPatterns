package com.design.model.decorate;

import com.design.model.decorate.components.HighScoreDecorator;
import com.design.model.decorate.components.SortDecorator;
import com.design.model.decorate.report.FourthGradeSchoolReport;
import com.design.model.decorate.report.SchoolReport;
import com.design.model.decorate.report.SugarFourthGradeSchoolReport;

/**
 * 老爸查看成绩单
 *
 * @author FYF
 * @date 2022/9/27
 */
public class Father {
	public static void main(String[] args) {
		SchoolReport sr = new FourthGradeSchoolReport();
		// 查看成绩单
		sr.report();
		// 签名
		sr.sign("你爹");
		
		System.out.println("-----------修饰一下报告---------------");
		SchoolReport sugarFourthGradeSchoolReport = new SugarFourthGradeSchoolReport();
		// 查看成绩单
		sugarFourthGradeSchoolReport.report();
		// 签名
		sugarFourthGradeSchoolReport.sign("你爹");
		System.out.println("---------修饰后的成绩单--------------");
		// 拿出成绩单
		SchoolReport schoolReport;
		// 原装四年级的成绩单 2、报道成绩单
		schoolReport = new FourthGradeSchoolReport();
		// 加了最高分修饰的成绩单 先高分在加排名查看  1、报道最高分
		schoolReport = new HighScoreDecorator(schoolReport);
		// 加了排名的成绩单 3、报道排名
		schoolReport = new SortDecorator(schoolReport);
		// 看成绩单
		schoolReport.report();
		// 满意就签名了
		schoolReport.sign("老三");
		
		
	}
	
}