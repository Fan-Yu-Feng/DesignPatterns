package com.design.model.builder;

import com.design.model.builder.builder.BenzBuilder;
import com.design.model.builder.car.BenzModel;
import com.design.model.builder.car.CarModel;
import com.design.enums.SequencesEnum;

import java.util.ArrayList;

/**
 * 优点：
 * 封装性：客户端不需要指导产品内部的组成的细节
 * 建造者独立，容易扩展
 * 便于控制细节风险：由于建造者都是独立的，因此可以对构造过程逐步细化，而不对其他模块造成影响
 * <p>
 * 使用场景
 * 1、相同的方法，不同的执行顺序，产生不同的事件结果时，可以采用建造者模式。
 *
 * 2、产品类非常复杂，或者产品类中的调用顺序不同产生了不同的效能，这个时候使用建
 * 造者模式非常合适。如奔驰车中不同的启动方式
 *
 * 3、在对象创建过程中会使用到系统中的一些其他对象，这些对象在产品对象的创建过程
 * 中不易得到时，也可以采用建造者模式封装该对象的创建过程。该种场景只能是一个补偿方
 * 法，因为一个对象不容易获得，而在设计阶段竟然没有发觉，而要通过创建者模式柔化创建
 * 过程，本身已经违反设计的最初目标。
 *
 * 4、多个部件或零件，都可以装配到一个对象中，但是产生的运行结果又不相同时，则可
 * 以使用该模式。
 *
 * 注意事项：建造者模式关注的是零件和转配工艺顺序（顺序），这是它与工厂方法模式最大不同的
 * 地方，虽然同为创建类模式，但是注重点不同。
 * @author FYF
 * @date 2022/8/13
 */
public class Client {
	
	public static void main(String[] args) {
		BenzModel benzModel = new BenzModel();
		ArrayList<SequencesEnum> sequencesEnums = new ArrayList<>();
		sequencesEnums.add(SequencesEnum.START);
		sequencesEnums.add(SequencesEnum.ALARM);
		sequencesEnums.add(SequencesEnum.STOP);
		benzModel.setSequence(sequencesEnums);
		benzModel.run();
		
		
		System.out.println("------有了建造者知乎的代码----------");
		ArrayList<SequencesEnum> sequencesEnums1 = new ArrayList<>();
		sequencesEnums1.add(SequencesEnum.START);
		sequencesEnums1.add(SequencesEnum.STOP);
		BenzBuilder benzBuilder = new BenzBuilder();
		benzBuilder.setSequence(sequencesEnums1);
		CarModel benzBuilderCarModel = benzBuilder.getCarModel();
		benzBuilderCarModel.run();
		sequencesEnums1.add(SequencesEnum.ALARM);
		benzBuilder.setSequence(sequencesEnums1);
		benzBuilderCarModel = benzBuilder.getCarModel();
		benzBuilderCarModel.run();
		System.out.println("加了指导类之后的代码");
		
		Director director = new Director();
		System.out.println("第一种奔驰车开");
		for (int i = 0; i < 100; i++) {
			
			director.getFirstBenzModel().run();
		}
		
		System.out.println("第一种宝马车开");
		for (int i = 0; i < 100; i++) {
			director.getFirstBmwModel().run();
		}
		System.out.println("第二种奔驰车开");
		for (int i = 0; i < 100; i++) {
			director.getSecondBenzModel().run();
		}
		
	}
}