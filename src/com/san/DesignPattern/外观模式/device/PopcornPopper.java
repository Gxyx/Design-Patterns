package com.san.DesignPattern.外观模式.device;

public class PopcornPopper {

    public void on() {
        System.out.println("PopcornPopper"+"---打开爆米花机");
    }

    public void off() {
        System.out.println("PopcornPopper"+ "---关闭爆米花机");
    }

    public void makePopcorn() {
        System.out.println("PopcornPopper"+"---制作爆米花");
    }
}
