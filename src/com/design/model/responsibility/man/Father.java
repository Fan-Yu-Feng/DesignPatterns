package com.design.model.responsibility.man;

import com.design.model.responsibility.women.IWomen;

/**
 * @author FYF
 * @date 2022/9/20
 */
public class Father extends Handler {
	
	/**
	 * 父亲只处理女儿的请求
	 */
	public Father(){
		super(Handler.FATHER_LEVEL_REQUEST);
	}
	
	
	@Override
	protected void response(IWomen women) {
		System.out.println("--------女儿向父亲请示-------");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是：同意\n");
	}
}