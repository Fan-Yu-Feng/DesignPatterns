package com.design.model.proxy.player;

import com.design.model.proxy.IPorxy;

/**
 * @author FYF
 * @date 2022/8/14
 */
public class GamePlayerProxy implements IGamePlayer , IPorxy {
	
	public GamePlayerProxy(IGamePlayer gamePlayer,String name) throws Exception {
		this.gamePlayer = new GamePlayer(this,name);
	}
	
	public GamePlayerProxy(IGamePlayer gamePlayer ) {
		this.gamePlayer = gamePlayer;
	}
	
	private IGamePlayer gamePlayer = null;
	
	private void before() {
		// this.gamePlayer.login(user, password);
	}
	
	private void after() {
		this.gamePlayer.killBoss();
		this.gamePlayer.upgrade();
	}
	public void request() {
		this.before();
		this.after();
	}
	
	/**
	 * 通过构造函数传递要对谁进行代练
	 *
	 * @param name 被代练的人
	 */
	public GamePlayerProxy(String name) {
		try {
			gamePlayer = new GamePlayer(this,name);
		} catch (Exception e) {
			System.out.println("异常");
		}
	}
	
	public IGamePlayer getGamePlayer() {
		return gamePlayer;
	}
	
	public void setGamePlayer(IGamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
	}
	
	/**
	 * 代练登录
	 *
	 * @param user     用户名
	 * @param password 密码
	 */
	@Override
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}
	
	
	/**
	 * 代练打怪
	 */
	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}
	
	/**
	 * 代练升级
	 */
	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
		this.count();
	}
	
	/**
	 * 代理是自己
	 * @return 自己代理
	 */
	@Override
	public IGamePlayer getProxy() {
		return this;
	}
	
	@Override
	public void count() {
		System.out.println("升级费用 150");
	}
}