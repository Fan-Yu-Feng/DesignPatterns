package com.design.model.faceade;

/**
 * 门面模式的定义：要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。门面模式提供一个高层次的接口，使得子系统更易于使用。
 * 在本次的例子中，警察和写信过程都是邮局的子系统，外部的人写信访问他们都需要经过邮局这个门面角色来进行
 * <p>
 * 优点：
 * 减少系统的相互依赖
 * 提高了灵活性
 * 提高安全性
 * <p>
 * 缺点：
 * 门面模式最大的缺点就是不符合开闭原则，对修改关闭，对扩展开放，看看我们那个门
 * 面对象吧，它可是重中之重，一旦在系统投产后发现有一个小错误，你怎么解决？完全遵从
 * 开闭原则，根本没办法解决。继承？覆写？都顶不上用，唯一能做的一件事就是修改门面角
 * 色的代码，这个风险相当大，这就需要大家在设计的时候慎之又慎，多思考几遍才会有好收获
 *
 * @author FYF
 * @since 2022/12/12 14:51
 */
public class    Client {
	
	public static void main(String[] args) {
		// 创建一个处理信件的过程
		ILetterProcess letterProcess = new LetterProcessImpl();
		// 开始写信
		letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your old lover. I'd like to...");
		// 开始写信封
		letterProcess.fillEnvelope("Happy Road No. 666,God Province,Heaven");
		// 把信放到信封里，并封装好
		letterProcess.letterIntoEnvelope();
		// 跑到邮局把信塞到邮箱，投递
		letterProcess.sendLetter();
		
		System.out.println("===========ModernPostOffice===========");
		
		//现代化的邮局，有这项服务，邮局名称叫Hell Road
		ModernPostOffice hellRoadPostOffice = new ModernPostOffice();
		//你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作
		//定义一个地址
		String address = "Happy Road No. 666,God Province,Heaven";
		//信的内容
		String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to....";
		//你给我发送吧
		hellRoadPostOffice.sendLetter(context, address);
	}
}