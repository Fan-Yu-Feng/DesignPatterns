package com.design.model.proxy.subject;

/**
 * 抽象主题
 * @author FYF
 * @date 2022/8/28
 */
public interface Subject {
	
	/**
	 * 业务操作
	 * @param string 传参数
	 */
	void doSomeThing(String string);
}
