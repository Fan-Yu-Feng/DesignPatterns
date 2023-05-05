package com.design.model.adapter;

import com.design.model.adapter.example.Adapter;
import com.design.model.adapter.example.ConcreteTarget;
import com.design.model.adapter.example.Target;

/**
 * 将一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作
 * <p>
 * 优点：
 * 1、适配器模式可以让两个没有任何关系的类在一起运行，只要适配器这个角色能够搞定
 * 他们就成
 * 2、增加了类的透明性：想想看，我们访问的Target目标角色，但是具体的实现都委托给了源角色，而这些对高层次模块是透明的，也是它不需要关心的
 * 3、提高了类的复用度：当然了，源角色在原有的系统中还是可以正常使用，而在目标角色中也可以充当新的演员
 * 4、灵活性非常好：某一天，突然不想要适配器，没问题，删除掉这个适配器就可以了，其他的代码都不用修改，基本上就类似一个灵活的构件，想用就用，不想就卸载。
 * <p>
 * 使用场景：你有动机修改一个已经投产中的接口时，适配器模式可能是最适合你的模式。
 * <p>
 * 注意事项：适配器模式最好在详细设计阶段不要考虑它，它不是为了解决还处在开发阶段的问题，而是解决正在服役的项目问题
 *
 * @author FYF
 * @date 2022/10/1
 */
public class Client {
	public static void main(String[] args) {
		// 没有与外系统连接的时候，是这样写的
		IUserInfo youngGirl = new UserInfo();
		// 从数据库中查到101个
		for (int i = 0; i < 101; i++) {
			youngGirl.getMobileNumber();
		}
		
		// 原有的业务逻辑
		Target target = new ConcreteTarget();
		target.request();
		// 现在增加了适配器角色后的业务逻辑
		Target target2 = new Adapter();
		// 这样执行能执行到目标的类
		target2.request();
	}
	
}