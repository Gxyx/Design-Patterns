package com.san.DesignPattern.工厂模式.抽象工厂模式;

public class XianSimpleRoujiaMoTeSeFactory {

    public RoujiaMo creatRoujiaMo(String type) {
        RoujiaMo roujiaMo = null;
        switch (type) {
            case "Suan":
                roujiaMo = new XianSuanRoujiMo();
                break;
            case "La":
//                roujiaMo = new XianKuRoujiMo();
                break;
            case "Tian":
//                roujiaMo = new XianlaRoujiMo();
                break;
            default:// 默认为酸肉夹馍
                roujiaMo = new XianSuanRoujiMo();
                break;
        }
        return roujiaMo;
    }
}
