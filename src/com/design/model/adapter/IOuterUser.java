package com.design.model.adapter;

import java.util.HashMap;

/**
 * 劳动派遣公司的用户接口
 *
 * @author FYF
 * @date 2022/9/30
 */
public interface IOuterUser {
	/**
	 * 基本信息，比如名称、性别、手机号码等
	 *
	 * @return 基本信息
	 */
	HashMap<String, String> getUserBaseInfo();
	
	/**
	 * 工作区域信息
	 *
	 * @return 用户工作信息
	 */
	HashMap<String, String> getUserOfficeInfo();
	
	/**
	 * 用户的家庭信息
	 *
	 * @return 家庭信息
	 */
	HashMap<String, String> getUserHomeInfo();
	
	
}
