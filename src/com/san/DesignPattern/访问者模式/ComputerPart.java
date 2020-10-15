package com.san.DesignPattern.访问者模式;

/**
 * 定义接受操作的 ComputerPart 接口。Keyboard、Mouse、Monitor 和 Computer 是实现了 ComputerPart 接口的实体类。
 *
 * 我们将定义另一个接口 ComputerPartVisitor，它定义了访问者类的操作。Computer 使用实体访问者来执行相应的动作。
 */
public interface ComputerPart {

     void accept(ComputerPartVisitor computerPartVisitor);

}
