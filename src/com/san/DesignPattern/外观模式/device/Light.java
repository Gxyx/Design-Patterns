package com.san.DesignPattern.外观模式.device;

public class Light {

    public void down() {
        System.out.println("Light"+ "---将灯光调暗");
    }

    public void up() {
        System.out.println("Light"+ "---将灯光调亮");
    }
}
