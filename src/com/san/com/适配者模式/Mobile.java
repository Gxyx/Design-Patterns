package com.san.com.适配者模式;

/**
 * 定义：将一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以相互合作。
 * 这个定义还好，说适配器的功能就是把一个接口转成另一个接口。
 */
public class Mobile {

    /**
     * 充电
     * @param power
     */
    public void inputPower(V5Power power){
        int provideV5Power = power.provideV5Power();
        System.out.println("手机（客户端）：我需要5V电压充电，现在是-->" + provideV5Power + "V");
    }
}
