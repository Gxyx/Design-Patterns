package com.san.DesignPattern.策略模式;

public class Display implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("样子1");
    }
}
