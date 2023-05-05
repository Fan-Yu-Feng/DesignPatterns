package com.design.model.memorandum;

/**
 * 备忘录模式-小男孩
 *
 * @author FYF
 * @since 2022/12/12 15:20
 */
public class Boy {
	/**
	 * 男孩的状态
	 */
	private String state;
	
	/**
	 * 认识女孩子后状态肯定改变，比如心情、手中的花等
	 */
	public void changeState() {
		this.state = "心情可能很不好";
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * 保留一个备份
	 *
	 * @return Memento
	 */
	public Memento createMemento() {
		return new Memento(this.state);
	}
	
	/**
	 * 恢复一个备份
	 *
	 * @param memento Memento
	 */
	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}
	
	
}