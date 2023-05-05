package com.design.principle.DIP.service;

/**
 * @author FYF @Description 驾驶人
 * @date 2022/4/28
 */
public interface IDriver {
  /**
   * 驾驶人接口开车
   *
   * @param iCar 汽车
   */
  public void driver(ICar iCar);

  /**
   * 依赖第二种传递方式：setter 依赖注入
   *
   * @param iCar 汽车
   */
  public void setCar(ICar iCar);
}
