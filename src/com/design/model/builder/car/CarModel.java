package com.design.model.builder.car;

import com.design.enums.SequencesEnum;

import java.util.ArrayList;

/**
 * @author FYF
 * @date 2022/8/13
 */
public abstract class CarModel {
	

	
	/**
	 * 序列号：各个基本方法执行的顺序
	 */
	private ArrayList<SequencesEnum> sequence = new ArrayList<>();
	
	/**
	 * 	 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正
	 * 	是要能够发动起来，那这个实现要在实现类里了
	 */
	public abstract void start();
	
	/**
	 * 能发动，还要能停下来，那才是真本事s
	 */
	public abstract void stop();
	
	/**
	 * 喇叭会出声音，是滴滴叫，还是哔哔叫
	 */
	public abstract void alarm();
	
	/**
	 * 引擎会轰隆隆地响，不响那是假的
	 */
	public abstract void engineBoom();
	
	final public void run(){
		for (SequencesEnum sequencesEnum : sequence) {
			switch (sequencesEnum) {
				case STOP:
					this.stop();
					break;
				case ALARM:
					this.alarm();
					break;
				case START:
					this.start();
					break;
				case ENGINE_BOOM:
					this.engineBoom();
					break;
				default:
					break;
			}
		}
	}
	
	
	public ArrayList<SequencesEnum> getSequence() {
		return sequence;
	}
	
	public void setSequence(ArrayList<SequencesEnum> sequence) {
		this.sequence = sequence;
	}
}