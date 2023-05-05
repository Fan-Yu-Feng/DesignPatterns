package com.design.model.order.group;

/**
 * 需求组
 *
 * @author FYF
 * @date 2022/7/8
 */
public class RequirementGroup extends Group {
	/**
	 * 找到这个组
	 */
	@Override
	public void find() {
		System.out.println("找到需求组");
	}
	
	/**
	 * 增加功能
	 */
	@Override
	public void add() {
		System.out.println("客户要求增加需求");
	}
	
	/**
	 * 删除功能
	 */
	@Override
	public void delete() {
		System.out.println("客户要求删除需求");
	}
	
	/**
	 * 修改功能
	 */
	@Override
	public void change() {
		System.out.println("客户要求修改需求");
	}
	
	/**
	 * 列出计划功能
	 */
	@Override
	public void plan() {
		System.out.println("客户变更计划");
	}
}
