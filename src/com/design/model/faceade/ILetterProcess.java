package com.design.model.faceade;

/**
 * 门面模式-我要投递信件
 * 写信投递接口
 *
 * @author FYF
 * @since 2022/12/12 14:31
 */
public interface ILetterProcess {
	/**
	 * 首先要写信的内容
	 *
	 * @param context 写信内容
	 */
	void writeContext(String context);
	
	/**
	 * 其次写信封
	 *
	 * @param address 地址
	 */
	void fillEnvelope(String address);
	
	/**
	 * 把信放到信封里
	 */
	void letterIntoEnvelope();
	
	/**
	 * 然后邮递
	 */
	void sendLetter();
	
	
}
