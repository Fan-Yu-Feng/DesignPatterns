package com.design.model.combination;

/**
 * 抽象公司职员类。作为分支或者树叶节点
 *
 * @author FYF
 * @date 2022/10/8
 */
public abstract class Corp {
	
	/**
	 * 记录自己的父节点
	 */
	private Corp parent;
	
	
	
	/**
	 * 公司每个人都有名称
	 */
	private String name;
	/**
	 * 公司每个人都职位
	 */
	private String position;
	/**
	 * 公司每个人都有薪水
	 */
	private int salary;
	
	public Corp(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	/**
	 * 获取员工信息
	 *
	 * @return 员工信息
	 */
	public String getInfo() {
		String info;
		info = "姓名：" + this.name;
		info = info + "\t职位：" + this.position;
		info = info + "\t薪水：" + this.salary;
		return info;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public Corp getParent() {
		return parent;
	}
	
	public void setParent(Corp parent) {
		this.parent = parent;
	}
}