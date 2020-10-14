package com.san.DesignPattern.原型模式;

import java.util.Observer;

/**
 * 原型模式
 *
 * 用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *
 * 这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。
 */

/**
 * 创建一个抽象类 Shape 和扩展了 Shape 类的实体类。
 * 下一步是定义类 ShapeCache，该类把 shape 对象存储在一个 Hashtable 中，并在请求的时候返回它们的克隆。
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected  String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
