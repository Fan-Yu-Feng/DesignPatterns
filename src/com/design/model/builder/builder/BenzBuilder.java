package com.design.model.builder.builder;

import com.design.enums.SequencesEnum;
import com.design.model.builder.car.BenzModel;
import com.design.model.builder.car.CarModel;

import java.util.ArrayList;

/**
 * @author FYF
 * @date 2022/8/13
 */
public class BenzBuilder extends CarBuilder {
	private final CarModel benzModel = new BenzModel();
	
	@Override
	public void setSequence(ArrayList<SequencesEnum> sequence) {
		this.benzModel.setSequence(sequence);
	}
	
	@Override
	public CarModel getCarModel() {
		return benzModel;
	}
}