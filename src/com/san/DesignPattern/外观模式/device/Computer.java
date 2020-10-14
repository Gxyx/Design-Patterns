package com.san.DesignPattern.外观模式.device;

public class Computer {

    public void on() {
        System.out.println("Computer"+ "---打开电脑");
    }

    public void off() {
        System.out.println("Computer"+"---关闭电脑");
    }

    public static class Projector {
    }
}