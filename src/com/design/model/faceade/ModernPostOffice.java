package com.design.model.faceade;

/**
 * 现代化邮局，封装复杂的信件处理过程
 *
 * @author FYF
 * @since 2022/12/12 14:53
 */
public class ModernPostOffice {
	private final ILetterProcess letterProcess = new LetterProcessImpl();
	private final Police letterPolice = new Police();
	
	/**
	 * 写信，封装，投递，一体化，不关心写信之类的顺序，已经将其封装好，只需要给我写信的内容既可
	 *
	 * @param context 信件内容
	 * @param address 地址
	 */
	public void sendLetter(String context, String address) {
		// 帮你写信
		letterProcess.writeContext(context);
		
		// 警察检查信封
		letterPolice.checkLetter(letterProcess);
		
		// 写好信封
		letterProcess.fillEnvelope(address);
		
		// 把信放到信封中
		letterProcess.letterIntoEnvelope();
		
		// 邮递信件
		letterProcess.sendLetter();
	}
	
}