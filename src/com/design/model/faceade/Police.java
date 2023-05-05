package com.design.model.faceade;

/**
 * @author FYF
 * @since 2022/12/12 14:57
 */
public class Police {
	/**
	 * 检查信件，检查完毕后警察在信封上盖个戳：此信无病毒
	 *
	 * @param letterProcess 写信过程
	 */
	public void checkLetter(ILetterProcess letterProcess) {
		System.out.println(letterProcess + " 信件已经检查过了...");
	}
}