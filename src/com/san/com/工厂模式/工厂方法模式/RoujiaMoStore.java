package com.san.com.工厂模式.工厂方法模式;


import com.san.com.工厂模式.简单工厂模式.RouJiaMo;

/**
 * 工厂方法模式:
 *  定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法模式把类实例化的过程推迟到子类。
 */
public abstract class RoujiaMoStore {

    public abstract RouJiaMo createRouJiaMo(String type);


    /**
     * 根据传入类型卖不同的肉夹馍
     * @param type
     * @return
     */
    public RouJiaMo sellRouJiaMo(String type){

        RouJiaMo rouJiaMo = createRouJiaMo(type);
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;

    }
}
