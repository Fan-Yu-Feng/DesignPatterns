package com.design.model.builder.builder;

import com.design.model.builder.car.CarModel;
import com.design.enums.SequencesEnum;

import java.util.ArrayList;

/**
 * 汽车抽象构建者
 *
 * @author FYF
 * @date 2022/8/13
 */
public abstract class CarBuilder {
	
	/**
	 * 传入构建车辆的需求顺序等
	 * @param sequence 构建车辆顺序
	 */
	public abstract void setSequence(ArrayList<SequencesEnum> sequence);
	
	/**
	 * 设置完毕顺序后，就可以直接拿到这个车辆模型
	 * @return CarModel
	 */
	public abstract CarModel getCarModel();
	
}