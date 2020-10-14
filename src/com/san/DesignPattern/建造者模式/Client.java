package com.san.DesignPattern.建造者模式;


/**
 * 建造者模式
 *
 * 定义：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 */


/**
 * 建造者模式与工厂模式类似，他们都是建造者模式，适用的场景也很相似。
 * 一般来说，如果产品的建造很复杂，那么请用工厂模式；
 * 如果产品的建造更复杂，那么请用建造者模式。
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Product product1 = director.getAProduct();
        product1.showProduct();

        Product product2 = director.getBProduct();
        product2.showProduct();
    }
}
