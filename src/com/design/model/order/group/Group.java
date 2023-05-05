package com.design.model.order.group;

/**
 * 命令模式
 *
 * @author FYF
 * @date 2022/7/8
 */
public abstract class Group {
	/**
	 * 找到这个组
	 */
	public abstract void find();
	
	/**
	 * 增加功能
	 */
	public abstract void add();
	
	/**
	 * 删除功能
	 */
	public abstract void delete();
	
	/**
	 * 修改功能
	 */
	public abstract void change();
	
	/**
	 * 列出计划功能
	 */
	public abstract void plan();
}
