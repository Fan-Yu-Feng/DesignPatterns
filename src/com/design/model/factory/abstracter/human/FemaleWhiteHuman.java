package com.design.model.factory.abstracter.human;

import com.design.model.factory.abstracter.AbstractWhiteHuman;

/**
 * @author FYF
 * @date 2022/8/6
 */
public class FemaleWhiteHuman extends AbstractWhiteHuman {
  /** 白人女性 */
  @Override
  public void getSex() {
    System.out.println("白人女性");
  }
}
