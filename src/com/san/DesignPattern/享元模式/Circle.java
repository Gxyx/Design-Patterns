package com.san.DesignPattern.享元模式;


/**
 * 享元模式
 *
 * 主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
