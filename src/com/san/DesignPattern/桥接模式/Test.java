package com.san.DesignPattern.桥接模式;

/**
 * 使用 Shape 和 DrawAPI 类画出不同颜色的圆。
 */

/**
 * 使用相同的抽象类方法但是不同的桥接实现类，来画出不同颜色的圆。
 */
public class Test {
    public static void main(String[] args) {

        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
