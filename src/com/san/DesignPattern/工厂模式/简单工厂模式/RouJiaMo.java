package com.san.DesignPattern.工厂模式.简单工厂模式;



public abstract class RouJiaMo {

    protected String name;

    /**
     * 准备工作
     */
    public void prepare(){
        System.out.println("揉面-剁肉-完成准备工作");
    }
    /**
     * 使用专门的包装袋
     */
    public void pack(){
        System.out.println("肉夹馍-专用袋-包装");
    }

    /**
     * 设备
     */
    public void  fire(){
        System.out.println("肉夹馍-专用设备-烘烤");
    }
}
