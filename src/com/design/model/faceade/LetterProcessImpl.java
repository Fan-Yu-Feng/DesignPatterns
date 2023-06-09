package com.design.model.faceade;

/**
 * @author FYF
 * @since 2022/12/12 14:50
 */
public class LetterProcessImpl implements ILetterProcess {
	@Override
	public void writeContext(String context) {
		System.out.println("填写信的内容..." + context);
	}
	
	@Override
	public void fillEnvelope(String address) {
		System.out.println("填写收件人地址及姓名..." + address);
	}
	
	@Override
	public void letterIntoEnvelope() {
		System.out.println("把信放到信封中...");
	}
	
	@Override
	public void sendLetter() {
		System.out.println("邮递信件...");
	}
}