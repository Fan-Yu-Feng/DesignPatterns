package com.design.model.iterator;

import java.util.Iterator;

/**
 * 项目迭代器
 * <p>
 * 迭代器模式的定义：它提供一种方法访问一个容器对象中各个元素，而又不需暴露该对象的内部细节。
 * 如Collection集合类型、Set类型等，迭代器模式就是为解决遍历这些容器中的元素而 诞生的。
 * <p>
 * 最佳实践：如果你是做Java开发，尽量不要自己写迭代器模式！省省吧，使用Java提供的Iterator一般就能满足你的要求了
 *
 * @author FYF
 * @date 2022/10/3
 */
public interface IProjectIterator extends Iterator<IProject> {
}