package com.san.com.适配者模式;

/**
 * 适配器
 */
public class V5PowerAdapter implements V5Power{

    /**
     * 组合方式
     */
    private V220Power v220Power;

    public V5PowerAdapter(V220Power v220Power){
        this.v220Power = v220Power;
    }

    @Override
    public int provideV5Power() {

       int power = v220Power.provideV220Power();

        //power经过各种操作-->5
        System.out.println("适配器：我悄悄的适配了电压。");
        return 5 ;
    }
}
