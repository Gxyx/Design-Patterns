package com.san.com.工厂模式.工厂方法模式;

import com.san.com.工厂模式.简单工厂模式.RouJiaMo;

public class XianRouJiaMoStore extends RoujiaMoStore {

    @Override
    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;
        if (type.equals("Suan"))
        {
            rouJiaMo = new XianSuanRouJiaMo();

        } else if (type.equals("Tian"))
        {
            rouJiaMo = new XianTianRouJiaMo();
        } else if (type.equals("La"))
        {
            rouJiaMo = new XianLaRouJiaMo();
        }
        return rouJiaMo;

    }
}
