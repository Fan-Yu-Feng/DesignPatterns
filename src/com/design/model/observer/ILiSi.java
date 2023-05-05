package com.design.model.observer;

/**
 * 观察者接口--李斯
 *
 * @author FYF
 * @version 1.0
 * @date 2022/10/9 12:46
 */
public interface ILiSi {
	/**
	 * 一旦发现别人有动静 自己也要行动起来
	 *
	 * @param context 内容
	 */
	void update(String context);
	
}
