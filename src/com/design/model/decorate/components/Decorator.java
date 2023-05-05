package com.design.model.decorate.components;

import com.design.model.decorate.report.FourthGradeSchoolReport;
import com.design.model.decorate.report.SchoolReport;

/**
 * @author FYF
 * @date 2022/9/27
 * @see SchoolReport 装饰的类
 * <p>
 * 专门进行装饰的类，避免类继承层次多维护成本高、
 * 定义： 动态地给一个对象添加一些额外的职责。 就增加功能来说，装饰模式相比生成子类更为灵活.
 * 在本次案例中，{@link FourthGradeSchoolReport} 需要进行装饰的, {@link Decorator} 为抽象的装饰类，必有一个 private 指向了成绩单的类
 * 而实现装饰类的具体类，是把最原始最基本的东西装饰城其他东西
 * <p>
 * 优点：
 * 1、装饰类和被装饰类可以独立发展，而不会相互耦合。换句话说，Component类无须知
 * 道Decorator类，Decorator类是从外部来扩展Component类的功能，而Decorator也不用知道具
 * 体的构件。
 * <p>
 * 2、装饰模式是继承关系的一个替代方案。我们看装饰类Decorator，不管装饰多少层，返
 * 回的对象还是Component，实现的还是is-a的关系。
 * <p>
 * 3、装饰模式可以动态地扩展一个实现类的功能，这不需要多说，装饰模式的定义就是如
 * 此
 * 缺点：
 * 多层的装饰是比较复杂的。为什么会复杂呢？你想想
 * 看，就像剥洋葱一样，你剥到了最后才发现是最里层的装饰出现了问题，想象一下工作量
 * 吧，因此，尽量减少装饰类的数量，以便降低系统的复杂度
 * <p>
 *使用场景：
 * 1、需要扩展一个类的功能，或给一个类增加附加功能。
 * 2、需要动态地给一个对象增加功能，这些功能可以再动态地撤销。
 * 3、需要为一批的兄弟类进行改装或加装功能，当然是首选装饰模式
 *
 *
 * 封装 {@link SchoolReport} 这个类
 */
public abstract class Decorator extends SchoolReport {
	
	/**
	 * 首先我要知道是哪个成绩单
	 * 装饰类的作用相当于一个特殊的代理类，真是的执行者还是被代理的角色
	 */
	private final SchoolReport sr;
	
	/**
	 * 构造函数，传递成绩单过来
	 *
	 * @param sr 学校成绩单
	 */
	public Decorator(SchoolReport sr) {
		this.sr = sr;
	}
	
	/**
	 * 成绩单还是要被看到的
	 */
	@Override
	public void report() {
		this.sr.report();
	}
	
	/**
	 * 看完还是要签名的
	 *
	 * @param name 名字
	 */
	@Override
	public void sign(String name) {
		this.sr.sign(name);
	}
	
	
}