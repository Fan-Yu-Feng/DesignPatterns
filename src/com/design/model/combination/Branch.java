package com.design.model.combination;

import java.util.ArrayList;

/**
 * 树枝节点
 *
 * @author FYF
 * @date 2022/10/3
 */
public class Branch extends Corp  {
	
	/**
	 * 存储子节点的信息
	 */
	private final ArrayList<Object> subordinateList = new ArrayList<>();
	
	public Branch(String name, String position, int salary) {
		super(name, position, salary);
	}
	
	
	public ArrayList<Object> getSubordinateInfo() {
		return this.subordinateList;
	}
	
	public void addSubordinate(Corp corp) {
		// 设置父节点
		corp.setParent(this);
		this.subordinateList.add(corp);
	}
}