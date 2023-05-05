package com.design.model.proxy.player;

/**
 * @author FYF
 * @date 2022/8/14
 */
public interface IGamePlayer {
	
	/**
	 * 登录游戏
	 * @param user 用户名
	 * @param password 密码
	 */
	void login(String user, String password);
	
	/**
	 * 杀怪，网络游戏的主要特色
	 */
	void killBoss();
	
	/**
	 * 升级
	 */
	void upgrade();
	
	/**
	 * 返回代理角色
	 * @return 代理
	 */
	IGamePlayer getProxy();
	
	
}