package com.design.model.responsibility;

import com.design.model.responsibility.women.IWomen;

/**
 * 有处理权的人，也就是能处理妇女请求的接口
 *
 * @author FYF
 * @date 2022/9/13
 */
public interface IHandler {
	/**
	 * 一个女性（女儿、妻子或者母亲）要求逛街，你要处理这个请求
	 *
	 * @param women 女性
	 */
	void handleMessage(IWomen women);
	
}