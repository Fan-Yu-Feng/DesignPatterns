package com.design.model.responsibility.women;

/**
 * 古代女性三从四德
 * “三从”是指“未嫁从父、既嫁从夫、夫死从子”
 *
 * @author FYF
 * @date 2022/9/13
 */
public interface IWomen {
	/**
	 * 获得个人状况 是否结婚
	 *
	 * @return 个人情况
	 */
	int getType();
	
	/**
	 * 获得个人请示，你要干什么？出去逛街？约会?还是看电影？
	 *
	 * @return 个人请示
	 */
	String getRequest();
	
	
}
