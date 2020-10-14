package com.san.DesignPattern.工厂模式.抽象工厂模式;

public class XianRouJiaMoYLFactroy implements RouJiaMoYLFactory {
    @Override
    public Meat createMeat() {

        return new FreshMest();
    }

    @Override
    public YuanLiao createYuanLiao() {

        return new XianTeSeYuanLiao();
    }
}
