package com.design.enums;

/**
 * 建造者模式，序列号方法
 *
 * @author FYF
 * @date 2022/8/13
 */
public enum SequencesEnum {
	// 自动
	START("1","START"),
	// 停止
	STOP("1","STOP"),
	// 喇叭
	ALARM("2","ALARM"),
	// 引擎声
	ENGINE_BOOM("4","ENGINE_BOOM"),
	;
	
	/**
	 * code 代码
	 */
	private String code;
	
	/**
	 * 方法名
	 */
	private String method;
	
	SequencesEnum(String s, String start) {
	}
	
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getMethod() {
		return method;
	}
	
	public void setMethod(String method) {
		this.method = method;
	}
	
	public SequencesEnum judgeCode(String code){
		for(SequencesEnum sequencesEnum:SequencesEnum.values()){
			if (code.equals(sequencesEnum.getCode())){
				return sequencesEnum;
			}
		}
		return null;
	}
	
}
