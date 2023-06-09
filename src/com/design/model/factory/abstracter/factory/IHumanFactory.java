package com.design.model.factory.abstracter.factory;

import com.design.model.factory.human.Human;

/**
 * 八卦炉生产人类定义
 *
 * <p>抽象工厂模式 优点： 1、封装性： ，每个产品的实现类不是高层模块要关心的，它要关心的是什么？是接口，是抽象，
 * 它不关心对象是如何创建出来，这由谁负责呢？工厂类，只要知道工厂类是谁，我就能创建出一个需要的对象，省时省力，优秀设计就应该如此。
 *
 * <p>2、产品族内的约束为非公开状态。例如生产男女比例的问题上，猜想女娲娘娘肯定有自 己的打算，不能让女盛男衰，否则女性的优点不就体现不出来了吗？那在抽象工厂模式，就
 * 应该有这样的一个约束：每生产1个女性，就同时生产出1.2个男性，这样的生产过程对调用 工厂类的高层模块来说是透明的，它不需要知道这个约束，我就是要一个黄色女性产品就可
 * 以了，具体的产品族内的约束是在工厂内实现的。
 *
 * <p>缺点：抽象工厂模式的最大缺点就是产品族扩展非常困难，为什么这么说呢？我们以通用代码 为例，如果要增加一个产品C，也就是说产品家族由原来的2个增加到3个，看看我们的程序
 * 有多大改动吧！抽象类AbstractCreator要增加一个方法createProductC()，然后两个实现类都要
 * 修改，想想看，这严重违反了开闭原则，而且我们一直说明抽象类和接口是一个契约。改变 契约，所有与契约有关系的代码都要修改，那么这段代码叫什么？叫“有毒代码”，——只要
 * 与这段代码有关系，就可能产生侵害的危险！
 *
 * <p>抽象工厂模式的使用场景定义非常简单：一个对象族（或是一组没有任何关系的对象） 都有相同的约束，则可以使用抽象工厂模式
 *
 * @author FYF
 * @date 2022/8/6
 */
public interface IHumanFactory {
  /**
   * 制造一个黄色人种
   *
   * @return Human
   */
  Human createYellowHuman();

  /**
   * 制造一个白色人种
   *
   * @return Human
   */
  Human createWhiteHuman();

  /**
   * 制造一个黑色人种
   *
   * @return Human
   */
  Human createBlackHuman();
}
