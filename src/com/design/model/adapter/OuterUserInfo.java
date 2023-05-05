package com.design.model.adapter;

import java.util.Map;

/**
 * 本公司和外部人力服务公司用户的中转类
 *
 * @author FYF
 * @date 2022/9/30
 */
public class OuterUserInfo extends OuterUser implements IUserInfo{
	
	/**
	 * 员工的基本信息
	 */
	private final Map<String,String> baseInfo = super.getUserBaseInfo();
	/**
	 * 员工的家庭信息
	 */
	private final Map<String,String> homeInfo = super.getUserHomeInfo();
	/**
	 * 工作信息
	 */
	private final Map<String,String> officeInfo = super.getUserOfficeInfo();
	
	@Override
	public String getUserName() {
		String homeAddress = this.baseInfo.get("userName");
		System.out.println(homeAddress);
		return homeAddress;
	}
	
	@Override
	public String getHomeAddress() {
		String homeTelNumber = this.homeInfo.get("homeAddress");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}
	
	@Override
	public String getMobileNumber() {
		String mobileNumber = this.baseInfo.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}
	
	@Override
	public String getOfficeTelNumber() {
		String officeTelNumber = this.officeInfo.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}
	
	@Override
	public String getJobPosition() {
		
		String jobPosition = this.officeInfo.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
		
		
	}
	
	@Override
	public String getHomeTelNumber() {
		String homeTelNumber = this.homeInfo.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}
}