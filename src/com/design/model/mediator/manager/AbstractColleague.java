package com.design.model.mediator.manager;

import com.design.model.mediator.AbstractMediator;

/**
 * 抽象同事类 使用中介者
 *
 * @author FYF
 * @date 2022/9/11
 */
public class AbstractColleague {
	protected AbstractMediator mediator;
	
	public AbstractColleague(AbstractMediator mediator) {
		this.mediator = mediator;
	}
	
	public AbstractColleague() {
	
	}
}