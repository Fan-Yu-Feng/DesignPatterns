package com.design.model.factory;

import com.design.model.factory.human.BlackHuman;
import com.design.model.factory.human.Human;
import com.design.model.factory.human.WhiteHuman;
import com.design.model.factory.human.YellowHuman;
import com.design.model.factory.abstracter.factory.FemaleFactoryI;
import com.design.model.factory.abstracter.factory.IHumanFactory;
import com.design.model.factory.abstracter.factory.MaleFactoryI;

/**
 * 女娲类
 *
 * @author FYF
 * @date 2022/7/11
 */
public class NvWa {
  public static void main(String[] args) {
    // 声明阴阳八卦炉
    AbstractHumanFactory YinYangLu = new HumanFactory();
    System.out.println("造白人");
    Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
    whiteHuman.getColor();
    whiteHuman.talk();
    System.out.println("造黄人");
    Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
    yellowHuman.getColor();
    yellowHuman.talk();
    System.out.println("造黑人");
    Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
    blackHuman.getColor();
    blackHuman.talk();

    System.out.println("------新增yellow人类工厂");
    Human yellowHuman1 = new YellowHumanFactory().createHuman();
    yellowHuman1.talk();
    yellowHuman1.getColor();

    System.out.println("------新增男女性人类 工厂");

    // 第一条生产线，男性生产线
    IHumanFactory maleHumanFactory = new MaleFactoryI();
    // 第二条生产线，女性生产线
    IHumanFactory femaleHumanFactory = new FemaleFactoryI();
    // 生产线建立完毕，开始生产人了:
    Human maleYellowHuman = maleHumanFactory.createYellowHuman();
    Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
    System.out.println("---生产一个黄色女性---");
    femaleYellowHuman.getColor();
    femaleYellowHuman.talk();
    femaleYellowHuman.getSex();
    System.out.println("\n---生产一个黄色男性---");
    maleYellowHuman.getColor();
    maleYellowHuman.talk();
    maleYellowHuman.getSex();
  }
}
