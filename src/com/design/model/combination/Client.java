package com.design.model.combination;

import java.util.ArrayList;

/**
 * 组合模式的定义：有时又叫做部分-整体模式（Part-Whole），主要是用来描述部分与整体的关系
 * 优点：
 * 1、高层模块调用简单：一棵树形机构中的所有节点都是Component，局部和整体对调用者来说没有任何区别，
 * 也就是说，高层模块不必关心自己处理的是单个对象还是整个组合结构，简化了高层模块的代码
 * 2、节点自由增加：使用了组合模式后，我们可以看看，如果想增加一个树枝节点、树叶节点是不是都很容
 * 易，只要找到它的父节点就成，非常容易扩展，符合开闭原则，对以后的维护非常有利。
 * <p>
 * 缺点：组合模式有一个非常明显的缺点，看到我们在场景类中的定义，提到树叶和树枝使用时
 * 的定义了吗？直接使用了实现类！这在面向接口编程上是很不恰当的，与依赖倒置原则冲
 * 突，读者在使用的时候要考虑清楚，它限制了你接口的影响范围。
 * <p>
 * 注意事项:只要是树形结构，就要考虑使用组合模式，这个一定要记住，只要是要体现局部和整体
 * 的关系的时候，而且这种关系还可能比较深，考虑一下组合模式吧
 *
 * @author FYF
 * @date 2022/10/3
 */
public class Client {
	public static void main(String[] args) {
		
		//首先产生了一个根节点
		Branch ceo = new Branch("王大麻子", "总经理", 100000);
		//产生三个部门经理，也就是树枝节点
		Branch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
		Branch salesDep = new Branch("马二拐子", "销售部门经理", 20000);
		Branch financeDep = new Branch("赵三驼子", "财务部经理", 30000);
		//再把三个小组长产生出来
		Branch firstDevGroup = new Branch("杨三乜斜", "开发一组组长", 5000);
		Branch secondDevGroup = new Branch("吴大棒槌", "开发二组组长", 6000);
		//剩下的就是我们这些小兵了,就是路人甲、路人乙
		Leaf a = new Leaf("a", "开发人员", 2000);
		Leaf b = new Leaf("b", "开发人员", 2000);
		Leaf c = new Leaf("c", "开发人员", 2000);
		Leaf d = new Leaf("d", "开发人员", 2000);
		Leaf e = new Leaf("e", "开发人员", 2000);
		Leaf f = new Leaf("f", "开发人员", 2000);
		Leaf g = new Leaf("g", "开发人员", 2000);
		Leaf h = new Leaf("h", "销售人员", 5000);
		Leaf i = new Leaf("i", "销售人员", 4000);
		Leaf j = new Leaf("j", "财务人员", 5000);
		Leaf k = new Leaf("k", "CEO秘书", 8000);
		Leaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 20000);
		ceo.addSubordinate(developDep);
		ceo.addSubordinate(salesDep);
		ceo.addSubordinate(financeDep);
		developDep.addSubordinate(firstDevGroup);
		developDep.addSubordinate(secondDevGroup);
		developDep.addSubordinate(zhengLaoLiu);
		
		firstDevGroup.addSubordinate(a);
		firstDevGroup.addSubordinate(b);
		firstDevGroup.addSubordinate(c);
		secondDevGroup.addSubordinate(d);
		secondDevGroup.addSubordinate(e);
		secondDevGroup.addSubordinate(f);
		
		salesDep.addSubordinate(h);
		salesDep.addSubordinate(i);
		salesDep.addSubordinate(j);
		
		System.out.println("ceo.getInfo() = " + ceo.getInfo());
		getAllSubordinateInfo(ceo.getSubordinateInfo());
		
	}
	
	private static void getAllSubordinateInfo(ArrayList<Object> subordinateInfo) {
		for (Object o : subordinateInfo) {
			if (o instanceof Leaf) {
				System.out.println("((Leaf) o).getInfo() = " + ((Leaf) o).getInfo());
				System.out.println("Leaf parent= " + ((Leaf) o).getParent().getInfo());
			} else {
				Branch branch = (Branch) o;
				System.out.println(branch.getInfo());
				
				System.out.println("branch parent= " + branch.getParent().getInfo());
				//再递归调用
				getAllSubordinateInfo(branch.getSubordinateInfo());
			}
		}
	}
	
}