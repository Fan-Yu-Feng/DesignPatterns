package com.design.model.adapter;

/**
 * @author FYF
 * @date 2022/9/30
 */
public class UserInfo implements IUserInfo {
	@Override
	public String getUserName() {
		System.out.println("员工名字");
		return null;
	}
	
	@Override
	public String getHomeAddress() {
		System.out.println("员工地址");
		return null;
	}
	
	@Override
	public String getMobileNumber() {
		System.out.println("员工手机号");
		return null;
	}
	
	@Override
	public String getOfficeTelNumber() {
		System.out.println("员工办公号码");
		return null;
	}
	
	@Override
	public String getJobPosition() {
		System.out.println("员工工作岗位");
		return null;
	}
	
	@Override
	public String getHomeTelNumber() {
		System.out.println("员工家庭电话");
		return null;
	}
}