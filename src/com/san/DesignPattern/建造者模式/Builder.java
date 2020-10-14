package com.san.DesignPattern.建造者模式;

/**
 * 抽象建造者
 *
 * 引入抽象建造者的目的，是为了将建造的具体过程交与它的子类来实现。
 * 这样更容易扩展。一般至少会有两个抽象方法，一个用来建造产品，一个是用来返回产品。
 */
public abstract class Builder {

    public abstract void setPart(String arg1, String arg2);
    public abstract Product getProduct();
}
