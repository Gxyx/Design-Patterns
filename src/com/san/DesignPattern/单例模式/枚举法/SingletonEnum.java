package com.san.DesignPattern.单例模式.枚举法;

public enum SingletonEnum {

    instance;

    private SingletonEnum() {}

    public void method(){
    }

    //访问方式
    //SingletonEnum.instance.method();
}
