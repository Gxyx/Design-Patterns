package com.san.DesignPattern.工厂模式.抽象工厂模式;

public class XianRoujiaMoTeSeStore extends RoujiaMoStore {

    private XianSimpleRoujiaMoTeSeFactory factory;

    public XianRoujiaMoTeSeStore(XianSimpleRoujiaMoTeSeFactory factory) {
        this.factory = factory;
    }

    public RoujiaMo sellRoujiaMo(String type) {

        RoujiaMo roujiaMo = factory.creatRoujiaMo(type);
        roujiaMo.prepare(new XianRouJiaMoYLFactroy());
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }


}
