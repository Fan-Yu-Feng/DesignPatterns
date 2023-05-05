package com.design.model.prototype;


import com.design.dto.AdvTemplateDto;

import java.util.Random;

/**
 * 原型模式场景类
 * <p>
 * 关系。注意，看Client类中的粗体字mail.clone()这个方法，把对象复制一份，产生一个新的
 * 对象，和原有对象一样，然后再修改细节的数据，如设置称谓、设置收件人地址等。这种不
 * 通过new关键字来产生一个对象，而是通过对象复制来实现的模式就叫做原型模式。
 * <p>
 * 优点：
 * ● 性能优良：原型模式是在内存二进制流的拷贝，要比直接new一个对象性能好很多，特别是要在一
 * 个循环体内产生大量的对象时，原型模式可以更好地体现其优点。
 * ● 逃避构造函数的约束：这既是它的优点也是缺点，直接在内存中拷贝，构造函数是不会执行的。
 * 优点就是减少了约束，缺点也是减少了约束，需要大家在实际应用时考虑。
 *
 * @author FYF
 * @date 2022/9/2
 */
public class Client {
	/**
	 * 发送账单的数量，这个值是从数据库中获得
	 */
	private static final int MAX_COUNT = 6;
	
	public static void main(String[] args) {
		// 模拟发送邮件
		int i = 0;
		//把模板定义出来，这个是从数据库中获得
		Mail mail = new Mail(new AdvTemplateDto());
		mail.setValue("clone 浅拷贝");
		mail.setTail("XX银行版权所有");
		while (i < MAX_COUNT) {
			Mail cloneMail = mail.clone();
			// 浅拷贝进本类型
			cloneMail.setValue("因为Java做了一个偷懒的拷贝动作，Object类提供\n的方法clone只是拷贝本对象，其对象内部的数组、引用对象等都不拷贝，还是指向原生对象\n" +
					                   "的内部元素地址，这种拷贝就叫做浅拷贝。确实是非常浅，两个对象共享了一个，这种拷贝就叫做浅拷贝。确实是非常浅，两个对象共享了一个私有变量，\n" +
					                   "你改我改大家都能改，是一种非常不安全的方式，在实际项目中使用还是比较少的（当然，这也是一种“危机”环境的一种救命方式）。" +
					                   "mail 使用 String 类型，而不会产生由浅拷贝带来的问题呢？内部的数组和引用对象才不拷贝，\n" +
					                   "其他的原始类型比如int、long、char等都会被拷贝，但是对于String类型，Java就希望你把它\n" +
					                   "认为是基本类型，它是没有clone方法的，处理机制也比较特殊，通过字符串池（stringpool）\n" +
					                   "在需要的时候才在内存中创建新的字符串，读者在使用的时候就把String当做基本类使用即\n" +
					                   "可。\n");
			// 以下是每封邮件不同的地方
			cloneMail.setAppellation(getRandString(5) + " 先生（女士）");
			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
			//然后发送邮件
			sendMail(cloneMail);
			i++;
		}
	}
	
	/**
	 * 获取指定长度的字符串
	 *
	 * @param i 场地
	 *
	 * @return 字符串
	 */
	private static String getRandString(int i) {
		String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder stringBuilder = new StringBuilder();
		Random random = new Random();
		for (int j = 0; j < i; j++) {
			stringBuilder.append(source.charAt(random.nextInt(source.length())));
		}
		return stringBuilder.toString();
	}
	
	/**
	 * 发送邮件
	 *
	 * @param mail 邮件
	 */
	public static void sendMail(Mail mail) {
		System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t...发送成功！");
	}
	
}