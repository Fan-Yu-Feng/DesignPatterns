package com.design.model.iterator;

/**
 * 项目信息接口
 *
 * @author FYF
 * @date 2022/10/2
 */
public interface IProject {
	
	/**
	 * 添加项目
	 *
	 * @param name 项目名称
	 * @param num  人数
	 * @param cost 开销
	 */
	void add(String name, int num, int cost);
	
	
	/**
	 * 删除项目
	 * @param name 项目名称
	 */
	void remove(String name);
	
	
	/**
	 * 获取项目信息
	 *
	 * @return 项目信息
	 */
	String getProjectInfo();
	
	
	/**
	 * 迭代遍历项目
	 * @return IProjectIterator
	 */
	IProjectIterator iterator();
	
}