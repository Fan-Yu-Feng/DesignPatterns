package com.design.model.adapter;

/**
 * 本公司的用户接口
 *
 * @author FYF
 * @date 2022/9/30
 */
public interface IUserInfo {
	
	/**
	 * 获得用户姓名
	 *
	 * @return 姓名
	 */
	String getUserName();
	
	/**
	 * 获得家庭地址
	 *
	 * @return 地址
	 */
	String getHomeAddress();
	
	/**
	 * 手机号码，这个太重要，手机泛滥呀
	 *
	 * @return 手机号
	 */
	String getMobileNumber();
	
	/**
	 * 办公电话，一般是座机
	 *
	 * @return 办公号码
	 */
	String getOfficeTelNumber();
	
	/**
	 * 这个人的职位是什么
	 *
	 * @return 职位
	 */
	String getJobPosition();
	
	/**
	 * 获得家庭电话，这有点不好，我不喜欢打家庭电话讨论工作
	 *
	 * @return 家庭电话
	 */
	String getHomeTelNumber();
	
	
}