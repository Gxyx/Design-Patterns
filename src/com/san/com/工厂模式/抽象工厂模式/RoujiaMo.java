package com.san.com.工厂模式.抽象工厂模式;



public abstract class RoujiaMo extends RoujiaMoStore {

    protected String name;

    /**
     * 准备工作
     */
    public final void prepare(RouJiaMoYLFactory ylFactroy)
    {
        Meat meat = ylFactroy.createMeat();
        YuanLiao yuanliao = ylFactroy.createYuanLiao();
        System.out.println("使用官方的原料" + meat + " , " + yuanliao + "作为原材料制作肉夹馍 ");
    }

    /**
     * 使用你们的专用袋-包装
     */
    public final void pack()
    {
        System.out.println("肉夹馍-专用袋-包装");
    }

    /**
     * 秘制设备-烘烤2分钟
     */
    public final void fire()
    {
        System.out.println("肉夹馍-专用设备-烘烤");
    }
}
