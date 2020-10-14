package com.san.DesignPattern.工厂模式.抽象工厂模式;


/**
 * 1、提供一个接口：public interface RouJiaMoYLFactroy
 * 2、用于创建相关的或依赖对象的家族 public Meat createMeat();public YuanLiao createYuanliao();我们接口用于创建一系列的原材料。
 */

public class Test {
    public static void main(String[] args) {
        RoujiaMoStore roujiaMoStore =  new  XianRoujiaMoTeSeStore(new XianSimpleRoujiaMoTeSeFactory());
        RoujiaMo saunroujiamo = roujiaMoStore.sellRoujiaMo("Suan");
        System.out.println(saunroujiamo.name);
    }
}
