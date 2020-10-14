package com.san.DesignPattern.装饰者模式;

/**
 * 装备的接口
 */

/**
 * 装饰者模式：若要扩展功能，装饰者提供了比集成更有弹性的替代方案，动态地将责任附加到对象上。
 * 原则：类应该对扩展开放，对修改关闭。
 */
public interface IEquip {

    /**
     * 计算攻击力
     * @return
     */
    public int caculateAttack();

    /**
     * 装备的描述
     * @return
     */
    public String description();
}
