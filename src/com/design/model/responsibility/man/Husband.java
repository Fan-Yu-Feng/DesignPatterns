package com.design.model.responsibility.man;

import com.design.model.responsibility.women.IWomen;

/**
 * @author FYF
 * @date 2022/9/20
 */
public class Husband extends Handler {
	
	public Husband() {
		super(HUSBAND_LEVEL_REQUEST);
	}
	
	@Override
	protected void response(IWomen women) {
		System.out.println("--------妻子向丈夫请示-------");
		System.out.println(women.getRequest());
		System.out.println("丈夫的答复是：同意\n");
	}
	
	
}