package com.design.model.prototype;


import com.design.dto.AdvTemplateDto;

import java.util.ArrayList;

/**
 * @author FYF
 * @date 2022/9/3
 */
public class Mail implements Cloneable {
	/**
	 * 收件人
	 */
	private String receiver;
	
	/**
	 * 邮件名称
	 */
	private String subject;
	
	/**
	 * 邮件内容
	 */
	private String context;
	
	/**
	 * 邮件结结尾
	 */
	private String tail;
	
	/**
	 * 称谓
	 */
	private String appellation;
	
	/**
	 * 定义一个私有变量
	 */
	private ArrayList<String> arrayList = new ArrayList<>();
	
	
	public String getAppellation() {
		return appellation;
	}
	
	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}
	
	public Mail() {
		System.out.println("构造函数被执行了，clone 不会执行构造函数");
	}
	
	public Mail(AdvTemplateDto advTemplateDto) {
		this.context = advTemplateDto.getAdvContext();
		this.subject = advTemplateDto.getAdvSubject();
	}
	
	@Override
	public Mail clone() {
		Mail mail;
		try {
			mail = (Mail) super.clone();
			
			// 进行深拷贝 引用对象的深拷贝 要使用clone方法，类的成员变量上不要增加final关键字。
			mail.arrayList = (ArrayList<String>) this.arrayList.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
		return mail;
	}
	
	public String getReceiver() {
		return receiver;
	}
	
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getContext() {
		return context;
	}
	
	public void setContext(String context) {
		this.context = context;
	}
	
	public String getTail() {
		return tail;
	}
	
	public void setTail(String tail) {
		this.tail = tail;
	}
	
	public ArrayList<String> getArrayList() {
		return arrayList;
	}
	
	public void setArrayList(ArrayList<String> arrayList) {
		this.arrayList = arrayList;
	}
	
	/**
	 * 设置HashMap的值
	 *
	 * @param value 值
	 */
	public void setValue(String value) {
		this.arrayList.add(value);
	}
	
	/**
	 * 取得arrayList的值
	 *
	 * @return ArrayList
	 */
	public ArrayList<String> getValue() {
		return this.arrayList;
	}
	
	
}