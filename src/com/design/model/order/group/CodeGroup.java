package com.design.model.order.group;

/**
 * 代码组
 *
 * @author FYF
 * @date 2022/7/8
 */
public class CodeGroup extends Group {
	/**
	 * 找到这个组
	 */
	@Override
	public void find() {
		System.out.println("找到代码组");
	}
	
	/**
	 * 增加功能
	 */
	@Override
	public void add() {
		System.out.println("客户要求增加代码");
	}
	
	/**
	 * 删除功能
	 */
	@Override
	public void delete() {
		System.out.println("客户要求删除代码");
	}
	
	/**
	 * 修改功能
	 */
	@Override
	public void change() {
		System.out.println("客户要求修改代码");
	}
	
	/**
	 * 列出计划功能
	 */
	@Override
	public void plan() {
		System.out.println("客户变更计划");
	}
}
