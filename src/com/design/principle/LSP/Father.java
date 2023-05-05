package com.design.principle.LSP;

import java.util.Collection;
import java.util.HashMap;

/**
 * @author FYF @Description 抽象父类
 * @date 2022/4/28
 */
public class Father {
  Collection doSomeThings(HashMap hashMap) {
    System.out.println("父类被执行");
    return hashMap.values();
  }
}
