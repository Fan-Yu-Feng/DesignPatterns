package com.design.model.iterator;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * 项目迭代器
 *
 * @author FYF
 * @date 2022/10/3
 */
public class ProjectIterator implements IProjectIterator {
	/**
	 * 所有的项目都放在ArrayList中
	 */
	private final ArrayList<IProject> projectList;
	
	/**
	 * 当前迭代的项目数
	 */
	private int currentItem = 0;
	
	public ProjectIterator(ArrayList<IProject> projectList) {
		this.projectList = projectList;
	}
	
	@Override
	public boolean hasNext() {
		boolean var = true;
		if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
			var = false;
		}
		return var;
	}
	
	@Override
	public IProject next() {
		return this.projectList.get(this.currentItem++);
	}
	
	@Override
	public void remove() {
	
	}
	
	@Override
	public void forEachRemaining(Consumer action) {
	
	}
}