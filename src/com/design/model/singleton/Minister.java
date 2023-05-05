package com.design.model.singleton;

/**
 * @author FYF
 * @Description 大臣类
 * @date 2022/7/10
 */

public class Minister {

  public static void main(String[] args) {
    //
	int ministerNum = 5;
    for (int i = 0; i< ministerNum; i++) {
    	Emperor emperor = Emperor.getInstance();
      System.out.println("大臣"+i+"参拜的是");
      Emperor.saySomething();
    }
  }
}