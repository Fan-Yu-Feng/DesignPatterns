package com.design.model.iterator;

import java.util.ArrayList;

/**
 * 项目信息具体实现类
 *
 * @author FYF
 * @date 2022/10/2
 */
public class Project implements IProject {
	
	/**
	 * 项目列表都放这里
	 */
	private final ArrayList<IProject> projectList = new ArrayList<>();
	/**
	 * 项目名称
	 */
	private String name = "";
	/**
	 * 项目成员数量
	 */
	private int num = 0;
	/**
	 * 项目费用
	 */
	private int cost = 0;
	
	public Project(String name, int num, int cost) {
		this.name = name;
		this.num = num;
		this.cost = cost;
	}
	
	public Project() {
	
	}
	
	
	@Override
	public void add(String name, int num, int cost) {
		this.projectList.add(new Project(name, num, cost));
	}
	
	@Override
	public void remove(String name) {
		System.out.println("删除项目 目前未用到");
	}
	
	@Override
	public String getProjectInfo() {
		String info = "";
		//获得项目的名称
		info = info + "项目名称是：" + this.name;
		//获得项目人数
		info = info + "\t项目人数: " + this.num;
		//项目费用
		info = info + "\t 项目费用：" + this.cost;
		return info;
	}
	
	@Override
	public IProjectIterator iterator() {
		return new ProjectIterator(this.projectList);
	}
	
	
}