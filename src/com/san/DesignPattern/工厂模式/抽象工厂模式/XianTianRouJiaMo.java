package com.san.DesignPattern.工厂模式.抽象工厂模式;

public class XianTianRouJiaMo extends RoujiaMo {

    public XianTianRouJiaMo(){
        this.name = "西安 甜肉夹馍";
    }

    @Override
    public RoujiaMo sellRoujiaMo(String type) {
        return null;
    }
}
