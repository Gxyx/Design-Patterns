package com.san.DesignPattern.适配者模式;


/**
 * 们使用一个适配器完成了把220V转化了5V然后提供给手机使用，且我们使用了组合（OO设计原则），
 * 原有的手机，以及200V电压类都不需要变化，且手机（客户端）和220V（被适配者）完全解耦。
 */
public class Test {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power());
        mobile.inputPower(v5Power);
    }
}
