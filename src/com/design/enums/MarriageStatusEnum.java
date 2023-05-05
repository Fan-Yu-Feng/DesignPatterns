package com.design.enums;

/**
 * 责任链模式，女性婚姻情况
 *
 * @author FYF
 * @date 2022/8/13
 */
public enum MarriageStatusEnum {
	/**
	 * 婚姻情况
	 */
	UNMARRIED(1, "未出嫁"),
	MARRIED(2, "已婚"),
	WIDOW(3, "夫死"),
	
	;
	
	/**
	 * code 代码
	 */
	private int type;
	private String msg;
	
	MarriageStatusEnum(int i, String msg) {
	
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public MarriageStatusEnum judgeType(int type) {
		for (MarriageStatusEnum marriageStatusEnum : MarriageStatusEnum.values()) {
			if (type == marriageStatusEnum.getType()) {
				return marriageStatusEnum;
			}
		}
		return null;
	}
	
}
