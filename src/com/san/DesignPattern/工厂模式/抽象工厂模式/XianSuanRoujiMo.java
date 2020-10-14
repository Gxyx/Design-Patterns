package com.san.DesignPattern.工厂模式.抽象工厂模式;

public class XianSuanRoujiMo extends RoujiaMo {

    public XianSuanRoujiMo() {
        this.name = "西安 酸肉夹馍";
    }

    @Override
    public RoujiaMo sellRoujiaMo(String type) {
        return null;
    }
}
