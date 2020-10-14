package com.san.DesignPattern.建造者模式;

/**
 * 建造者
 *
 * 实现抽象类的所有未实现的方法，具体来说一般是两项任务：组建产品；返回组建好的产品。
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    @Override
    public void setPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }

    @Override
    public Product getProduct() {
        return  product;
    }
}
