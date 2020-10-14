package com.san.DesignPattern.装饰者模式;

public class YellowGemDecorator implements IEquipDecorator {

    /**
     * 每个装饰品维护一个装备
     */
    private IEquip equip;

    public YellowGemDecorator(IEquip equip){
        this.equip = equip;
    }
    @Override
    public int caculateAttack() {
        return 10 + equip.caculateAttack();
    }

    @Override
    public String description() {
        return equip.description() + "+ 黄宝石";
    }
}
