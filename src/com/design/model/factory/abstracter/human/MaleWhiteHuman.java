package com.design.model.factory.abstracter.human;

import com.design.model.factory.abstracter.AbstractWhiteHuman;

/**
 * @author FYF
 * @date 2022/8/6
 */
public class MaleWhiteHuman extends AbstractWhiteHuman {
  /** 白人男性 */
  @Override
  public void getSex() {
    System.out.println("白人男性");
  }
}
