package com.design.principle.LSP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Description 里式替换原则：Liskov Substitution Principle
 *
 * @author FYF
 * @date 2022/4/28
 */
public class Client {

  /** 父类存在的地方子类必定可以存在 子类方法携带的参数不能大于父类， 否则就违反里式替换原则 里式替换原则：父类存在的地方，子类必然可以存在，反之不成立 */
  public static void invoker() {
    Son son = new Son();
    Map map = new HashMap();
    son.doSomeThings(map);
  }

  public static void main(String[] args) {
    System.out.println("args = " + Arrays.toString(args));
    invoker();
  }
}
