package com.design.principle.LSP;

import java.util.Collection;
import java.util.Map;

/**
 * @author FYF @Description
 * @date 2022/4/28
 */
public class Son extends Father {

  public Collection doSomeThings(Map hashMap) {
    System.out.println("子类被执行");
    return hashMap.values();
  }
}
