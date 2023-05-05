package com.design.model.observer;


/**
 * 间谍类
 *
 * @author FYF
 * @version 1.0
 * @date 2022/10/9 12:49
 */


public class Spy extends Thread{
	
	/**
	 * 间谍-中间类-观察监控数据
	 */
	private HanFeiZi hanFeiZi;
	private LiSi liSi;
	private String type;
	
	
	public Spy(HanFeiZi hanFeiZi, LiSi liSi, String type) {
		this.hanFeiZi = hanFeiZi;
		this.liSi = liSi;
		this.type = type;
	}
	
	@Override
	public void run() {
		
		try {
			
			while(true){
				if("breakfast".equals(this.type)){
					//监控是否在吃早餐
					//如果发现韩非子在吃饭，就通知李斯
					if(this.hanFeiZi.isHavingBreakfast()){
						this.liSi.update("韩非子在吃饭");
						//重置状态，继续监控
						this.hanFeiZi.setHavingBreakfast(false);
					}
				}else{
					//监控是否在娱乐
					if(this.hanFeiZi.isHavingFun()){
						this.liSi.update("韩非子在娱乐");
						this.hanFeiZi.setHavingFun(false);
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}