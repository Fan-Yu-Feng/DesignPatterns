package com.design.model.singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author FYF @Description 单例模式，古代皇帝
 * @date 2022/7/10
 */
public class Emperor {
  private static final Emperor emperor = new Emperor();
  // 定义最多能产生的实例数量
  private static int maxNumOfEmperor = 2;
  // 每个皇帝都有名字，使用一个ArrayList来容纳，每个对象的私有属性。
  private static ArrayList<String> nameList = new ArrayList<>();
  private static ArrayList<Emperor> emperorArrayList = new ArrayList<>();
  // 当前皇帝序列化
  private static int countNumOfEmperor = 0;

  static {
    for (int i = 0; i < maxNumOfEmperor; i++) {
      emperorArrayList.add(new Emperor("皇帝" + i));
    }
  }
  // 私有，不能够给人实例化第二个这个对象。
  private Emperor() {}
  // 建立一个有名字的皇帝对象
  private Emperor(String name) {
    nameList.add(name);
  }

  public static Emperor getInstance() {
    Random random = new Random();
    countNumOfEmperor = random.nextInt(maxNumOfEmperor);
    return emperorArrayList.get(countNumOfEmperor);
  }

  public static void saySomething() {
    System.out.println("皇帝说点啥" + nameList.get(countNumOfEmperor));
  }
}
