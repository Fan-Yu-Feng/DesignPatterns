package com.design.principle.DIP.service.impl;

import com.design.principle.DIP.service.ICar;
import com.design.principle.DIP.service.IDriver;

/**
 * @author FYF @Description 司机类
 * @date 2022/4/28
 */
public class Driver implements IDriver {
  private ICar iCar;

  /**
   * 驾驶人接口开车，第3中依赖传递方式，在接口中声明依赖
   *
   * @param iCar 汽车
   */
  @Override
  public void driver(ICar iCar) {
    iCar.run();
  }

  /**
   * 依赖第二种传递方式：setter 依赖注入
   *
   * @param iCar 汽车
   */
  @Override
  public void setCar(ICar iCar) {
    this.iCar = iCar;
  }

  /**
   * 依赖是可以传递的，将汽车传递给驾驶人
   *
   * @param iCar 汽车接口
   */
  public Driver(ICar iCar) {
    this.iCar = iCar;
  }

  /** 1、这时候传递的依赖就可以这样传递，这是第一种依赖的写法：构造参数的方式进行传递依赖, */
  public void driver() {
    this.iCar.run();
  }
}
