package com.design.principle.DIP;

import com.design.principle.DIP.service.impl.BMW;
import com.design.principle.DIP.service.impl.Benz;
import com.design.principle.DIP.service.impl.Driver;

/**
 * @Description （Dependence Inversion Principle,DIP） 依赖倒置原则
 *
 * <p>高层模块不应该依赖低层模块，两者都应该依赖其抽象； 抽象不应该依赖细节； ● 细节应该依赖抽象。 ● 细节应该依赖抽象。 总的来说就是面向接口编程
 *
 * @author FYF
 * @date 2022/4/28
 */
public class Client {
  public static void main(String[] args) {
    Benz benz = new Benz();
    Driver driver = new Driver(benz);
    driver.driver(benz);
    BMW bmw = new BMW();
    driver.driver(bmw);
  }
}
