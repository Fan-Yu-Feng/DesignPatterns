package com.design.model.proxy.player;

/**
 * @author FYF
 * @date 2022/8/14
 */
public class GamePlayer implements IGamePlayer {
	
	private IGamePlayer proxy = null;
	/**
	 * 用户名
	 */
	private String name;
	
	public GamePlayer(IGamePlayer iGamePlayer,String name) throws Exception {
		if(iGamePlayer == null){
			System.out.println("不能创建真实角色!");
			throw new Exception("不能创建真实角色");
		}
		if(iGamePlayer instanceof GamePlayerProxy){
			this.proxy = iGamePlayer;
			this.name = name;
		}
	}
	
	public GamePlayer(String name) {
		this.name = name;
	}
	
	
	@Override
	public void login(String user, String password) {
		if(isProxy()){
			System.out.println("登录名为"+user+"的用户"+this.name+"登录成功！");
		}else{
			System.out.println("请使用指定的代理访问");
		}
	}
	
	@Override
	public void killBoss() {
		if(this.isProxy()){
			System.out.println(this.name + "在打怪！");
		}else {
			System.out.println("请使用指定的代理访问");
		}
	}
	
	@Override
	public void upgrade() {
		if(this.isProxy()){
			System.out.println(this.name + " 又升了一级！");
		}else {
			System.out.println("请使用指定的代理访问");
		}
	}
	
	@Override
	public IGamePlayer getProxy() {
		if(isProxy()){
			proxy = new GamePlayerProxy(this);
		}
		
		return this.proxy;
	}
	
	
	/**
	 *  判断代理是否存在
	 * @return boolean
	 */
	private boolean isProxy(){
		return this.proxy != null;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}