package com.design.model.combination;

/**
 * 叶子信息-小员工信息
 *
 * @author FYF
 * @date 2022/10/3
 */
public class Leaf extends Corp  {

	/**
	 * 通过构造函数传递信息
	 *
	 * @param name     姓名
	 * @param position 职位
	 * @param salary   薪水
	 */
	public Leaf(String name, String position, int salary) {
		super(name,position,salary);
	}
}