package com.design.model.responsibility;

import com.design.model.responsibility.man.Father;
import com.design.model.responsibility.man.Handler;
import com.design.model.responsibility.man.Husband;
import com.design.model.responsibility.man.Son;
import com.design.model.responsibility.women.IWomen;
import com.design.model.responsibility.women.Women;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author FYF
 * @date 2022/9/20
 */
public class Client {
	
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<IWomen> womenArrayList = new ArrayList<>();
		
		for(int i=0;i<5;i++){
			womenArrayList.add(new Women(random.nextInt(4),"我要出去逛街"));
		}
		Handler father = new Father();
		Handler son = new Son();
		Handler husband = new Husband();
		// 设置请求顺序
		father.setNext(husband);
		husband.setNext(son);
		for (IWomen women : womenArrayList) {
			switch (women.getType()) {
				case 1:
					System.out.println("\n--------女儿向父亲请示-------");
					father.handleMessage(women);
					break;
				case 2:
					System.out.println("\n--------妻子向父亲请示-------");
					husband.handleMessage(women);
					break;
				case 3:
					System.out.println("\n--------母亲向儿子请示-------");
					son.handleMessage(women);
					break;
				default:
					break;
			}
		}
	}
}