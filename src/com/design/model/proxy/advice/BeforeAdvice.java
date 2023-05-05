package com.design.model.proxy.advice;

/**
 * 前置通知
 *
 * @author FYF
 * @date 2022/8/28
 */
public class BeforeAdvice implements IAdvice {
	@Override
	public void exec(){
		System.out.println("我是前置通知，我被执行了！");
	}
}