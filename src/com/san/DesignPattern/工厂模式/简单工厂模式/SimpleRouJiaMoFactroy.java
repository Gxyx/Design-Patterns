package com.san.DesignPattern.工厂模式.简单工厂模式;


/**
 * 简单工厂
 */
public class SimpleRouJiaMoFactroy {

    public RouJiaMo createRouJiaMo(String type){
        RouJiaMo rouJiaMo = null;
        if (type.equals("Suan"))
        {
            rouJiaMo = new SuanRouJiaMo();

        } else if (type.equals("Tian"))
        {
            rouJiaMo = new TianRouJiaMo();
        } else if (type.equals("La"))
        {
            rouJiaMo = new LaRouJiaMo();
        }
        return rouJiaMo;

    }
}
