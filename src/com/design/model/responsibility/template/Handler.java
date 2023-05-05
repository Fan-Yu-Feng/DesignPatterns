package com.design.model.responsibility.template;

/**
 * 抽象责任链模板
 * 优点：
 * 责任链模式非常显著的优点是将请求和处理分开。请求者可以不用知道是谁处理的，处
 * 理者可以不用知道请求的全貌（例如在J2EE项目开发中，可以剥离出无状态Bean由责任链处
 * 理），两者解耦，提高系统的灵活性。
 * <p>
 * 缺点
 * 责任链有两个非常显著的缺点：一是性能问题，每个请求都是从链头遍历到链尾，特别
 * 是在链比较长的时候，性能是一个非常大的问题。二是调试不很方便，特别是链条比较长，
 * 环节比较多的时候，由于采用了类似递归的方式，调试的时候逻辑可能比较复杂。
 * <p>
 * 注意事项：
 * 链中节点数量需要控制，避免出现超长链的情况，一般的做法是在Handler中设置一个
 * 最大节点数量，在setNext方法中判断是否已经是超过其阈值，超过则不允许该链建立，避免
 * 无意识地破坏系统性能。
 *
 * @author FYF
 * @date 2022/9/20
 */
public abstract class Handler {
	
	private Handler nextHandler;
	
	/**
	 * 每个处理者都必须对请求做出处理
	 *
	 * @param request 请求数据
	 *
	 * @return 响应
	 */
	public final Response handleMessage(Request request) {
		Response response = null;
		//判断是否是自己的处理级别
		if (this.getHandlerLevel().equals(request.getRequestLevel())) {
			response = this.echo(request);
		} else {
			//不属于自己的处理级别
			//判断是否有下一个处理者
			if (this.nextHandler != null) {
				response = this.nextHandler.handleMessage(request);
			} else {
				
				System.out.println("没有适当的处理者，业务自行处理");
			}
		}
		return response;
	}
	
	/**
	 * 设置下一个处理者是谁
	 *
	 * @param handler 处理着
	 */
	public void setNext(Handler handler) {
		this.nextHandler = handler;
	}
	
	/**
	 * 每个处理者都有一个处理级别
	 *
	 * @return 等级
	 */
	protected abstract Level getHandlerLevel();
	
	/**
	 * 每个处理者都必须实现处理任务
	 *
	 * @param request 请求数据
	 *
	 * @return 响应数据
	 */
	protected abstract Response echo(Request request);
}

