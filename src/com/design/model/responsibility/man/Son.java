package com.design.model.responsibility.man;

import com.design.model.responsibility.women.IWomen;

/**
 * @author FYF
 * @date 2022/9/20
 */
public class Son extends Handler{
	public Son() {
		super(SON_LEVEL_REQUEST);
	}
	
	@Override
	protected void response(IWomen women) {
		System.out.println("--------母亲向儿子请示-------");
		System.out.println(women.getRequest());
		System.out.println("儿子的答复是：同意\n");
	}
}