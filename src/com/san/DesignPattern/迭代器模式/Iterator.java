package com.san.DesignPattern.迭代器模式;


/**
 * 迭代器模式是 Java 和 .Net 编程环境中非常常用的设计模式。这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 * 迭代器模式属于行为型模式。
 *
 * 注意：
 *        迭代器模式就是分离了集合对象的遍历行为，
 *        抽象出一个迭代器类来负责，这样既可以做到不暴露集合的内部结构，又可让外部代码透明地访问集合内部的数据
 */
public interface Iterator {
     boolean hashNext();
     Object next();
}
