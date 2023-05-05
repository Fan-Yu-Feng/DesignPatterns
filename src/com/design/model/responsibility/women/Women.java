package com.design.model.responsibility.women;

/**
 * 女人类
 *
 * @author FYF
 * @date 2022/9/13
 */
public class Women implements IWomen {
	
	/**
	 * 通过一个int类型的参数来描述妇女的个人状
	 * 1--未出嫁
	 * 2--出嫁
	 * 3--夫死
	 */
	private int type;
	/**
	 * 妇女的请示
	 */
	private String request;
	
	
	@Override
	public int getType() {
		return this.type;
	}
	
	@Override
	public String getRequest() {
		return this.request;
	}
	
	
	public Women(int type, String request) {
		this.type = type;
		//为了便于显示，在这里做了点处理
		switch(this.type){
			case 1:
				this.request = "女儿的请求是：" + request;
				break;
			case 2:
				this.request = "妻子的请求是：" + request;
				break;
			case 3:
				this.request = "母亲的请求是：" + request;
			default:
				break;
		}

	}
	
	
	public void setType(int type) {
		this.type = type;
	}
	
	public void setRequest(String request) {
		this.request = request;
	}
}