package com.design.model.builder;

import com.design.model.builder.builder.BenzBuilder;
import com.design.model.builder.builder.BmwBuilder;
import com.design.model.builder.car.BenzModel;
import com.design.model.builder.car.BmwModel;
import com.design.enums.SequencesEnum;

import java.util.ArrayList;

/**
 * 导演类
 * 本类中有很多this调用: 一般调用本类中的成员变量和方法，需要加上this关键字，不加的话不清晰。
 * 还有super方法也是一样的，这是约束
 *
 * @author FYF
 * @date 2022/8/13
 */
public class Director {
	private final ArrayList<SequencesEnum> sequence = new ArrayList<>();
	private final BenzBuilder benzBuilder = new BenzBuilder();
	private final BmwBuilder bmwBuilder = new BmwBuilder();
	
	/**
	 * 第一种奔驰车 直接开车和启动
	 * @return BenzModel
	 */
	public BenzModel getFirstBenzModel(){
		//清理场景，这里是一些初级程序员不注意的地方
		this.sequence.clear();
		//ABenzModel的执行顺序
		this.sequence.add(SequencesEnum.START);
		this.sequence.add(SequencesEnum.STOP);
		//按照顺序返回一个奔驰车
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
	
	/**
	 * 第一种宝马车 直接开车和启动
	 * @return BenzModel
	 */
	public BmwModel getFirstBmwModel(){
		//清理场景，这里是一些初级程序员不注意的地方
		this.sequence.clear();
		this.sequence.add(SequencesEnum.START);
		this.sequence.add(SequencesEnum.ALARM);
		this.sequence.add(SequencesEnum.STOP);
		//按照顺序返回一个宝马车
		this.benzBuilder.setSequence(this.sequence);
		return (BmwModel)this.bmwBuilder.getCarModel();
	}
	
	/**
	 * 第二种奔驰车 直接开车和启动
	 * @return BenzModel
	 */
	public BenzModel getSecondBenzModel(){
		//清理场景，这里是一些初级程序员不注意的地方
		this.sequence.clear();
		//ABenzModel的执行顺序
		this.sequence.add(SequencesEnum.ENGINE_BOOM);
		this.sequence.add(SequencesEnum.START);
		this.sequence.add(SequencesEnum.ALARM);
		this.sequence.add(SequencesEnum.STOP);
		//按照顺序返回一个奔驰车
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
	
}