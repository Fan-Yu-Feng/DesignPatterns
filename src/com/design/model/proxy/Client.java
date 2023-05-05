package com.design.model.proxy;

import com.design.model.proxy.handle.GamePlayHandle;
import com.design.model.proxy.handle.MyInvocationHandler;
import com.design.model.proxy.player.GamePlayer;
import com.design.model.proxy.player.GamePlayerProxy;
import com.design.model.proxy.player.IGamePlayer;
import com.design.model.proxy.subject.RealSubject;
import com.design.model.proxy.subject.Subject;
import com.design.model.proxy.subject.SubjectDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理模式优点
 * 职责清晰：真实的角色就是实现实际的业务逻辑，不用关心其他非本职责的事务，通过后期的代理
 * 完成一件事务，附带的结果就是编程简洁清晰。
 * <p>
 * 高扩展性
 * 具体主题角色是随时都会发生变化的，只要它实现了接口，甭管它如何变化，都逃不脱
 * 如来佛的手掌（接口），那我们的代理类完全就可以在不做任何修改的情况下使用。
 * <p>
 * 智能化
 *
 * @author FYF
 * @date 2022/8/14
 */
public class Client {
	
	public static void main(String[] args) throws Exception {
		IGamePlayer iGamePlayer = new GamePlayer("张三");
		iGamePlayer.login("张三", "123456");
		iGamePlayer.killBoss();
		iGamePlayer.upgrade();
		
		IGamePlayer gamePlayer = new GamePlayerProxy("张三");
		
		gamePlayer.login("代练登录", "123456");
		gamePlayer.killBoss();
		gamePlayer.upgrade();
		
		System.out.println("----强制代理----");
		IGamePlayer gamePlayer1 = new GamePlayer("李四");
		GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(gamePlayer1, "李四");
		gamePlayerProxy.login("李四", "123456");
		gamePlayerProxy.killBoss();
		gamePlayerProxy.upgrade();
		
		
		gamePlayer = new GamePlayer("张三");
		InvocationHandler gamePlayHandle = new GamePlayHandle(gamePlayer);
		System.out.println("开始游戏啦");
		// 获得类的 classLoader
		ClassLoader classLoader = gamePlayer.getClass().getClassLoader();
		// 获取动态代理
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, gamePlayHandle);
		proxy.login("zhangSan", "password");
		proxy.killBoss();
		proxy.upgrade();
		Subject subject = new RealSubject();
		InvocationHandler handler = new MyInvocationHandler(subject);
		Subject subjectProxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
		subjectProxy.doSomeThing("代理做事情");
		
		Subject proxyInstance = SubjectDynamicProxy.newProxyInstance(subject);
		proxyInstance.doSomeThing("指定业务代理干活");
		
	}
}