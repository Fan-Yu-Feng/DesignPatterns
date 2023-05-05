package com.design.model.strategy;

import com.design.model.strategy.components.BackDoor;
import com.design.model.strategy.components.BlockEnemy;
import com.design.model.strategy.components.GivenGreenLight;

/**
 * 赵云执行锦囊妙计
 *
 * @author FYF
 * @date 2022/9/30
 */
public class ZhaoYun {
	
	public static void main(String[] args) {
		Context context;
		
		System.out.println("---刚刚到吴国的时候拆第一个---");
		//拿到妙计
		context = new Context(new BackDoor());
		context.operate(); //拆开执行
		System.out.println("\n\n\n\n\n\n\n\n");
		//刘备乐不思蜀了，拆第二个了
		System.out.println("---刘备乐不思蜀了，拆第二个了---");
		context = new Context(new GivenGreenLight());
		context.operate(); //执行了第二个锦囊
		System.out.println("\n\n\n\n\n\n\n\n");
		//孙权的小兵追来了，咋办？拆第三个
		System.out.println("---孙权的小兵追来了，咋办？拆第三个---");
		context = new Context(new BlockEnemy());
		context.operate();
		
		
		
	}
	
}