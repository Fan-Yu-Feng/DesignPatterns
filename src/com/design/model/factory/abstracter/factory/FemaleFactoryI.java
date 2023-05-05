package com.design.model.factory.abstracter.factory;

import com.design.model.factory.human.Human;
import com.design.model.factory.abstracter.human.FemaleBlackHuman;
import com.design.model.factory.abstracter.human.FemaleWhiteHuman;
import com.design.model.factory.abstracter.human.FemaleYellowHuman;

/**
 * 生产女性的八卦炉
 * @author FYF
 * @date 2022/8/6
 */
public class FemaleFactoryI implements IHumanFactory {
	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}
	
	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}
	
	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}
}


