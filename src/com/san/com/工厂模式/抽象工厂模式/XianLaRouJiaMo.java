package com.san.com.工厂模式.抽象工厂模式;



public class XianLaRouJiaMo extends RoujiaMo {

    public XianLaRouJiaMo(){
        this.name = "西安 辣肉夹馍";
    }

    @Override
    public RoujiaMo sellRoujiaMo(String type) {
        return null;
    }
}
