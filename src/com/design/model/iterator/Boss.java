package com.design.model.iterator;

import java.util.ArrayList;

/**
 * 老大看报表
 *
 * @author FYF
 * @date 2022/10/2
 */
public class Boss {
	public static void main(String[] args) {
		ArrayList<IProject> projectArrayList = new ArrayList<>();
		IProject project = new Project();
		
		project.add("星球大战项目", 10, 1000);
		project.add("扭转时空项目", 10000, 100000);
		project.add("超人改造项目", 10000, 10000000);
		
		for (int i = 4; i < 104; i++) {
			project.add("第" + i + "个项目", i * 5, i * 1000000);
		}
		
		IProjectIterator iterator = project.iterator();
		while (iterator.hasNext()){
			IProject next = iterator.next();
			System.out.println("next = " + next.getProjectInfo());
		}
	}
}