package com.design.model.factory.abstracter.human;

import com.design.model.factory.abstracter.AbstractBlackHuman;

/**
 * @author FYF
 * @date 2022/8/6
 */
public class MaleBlackHuman extends AbstractBlackHuman {
  /** 黑人男性 */
  @Override
  public void getSex() {
    System.out.println("黑人男性");
  }
}
