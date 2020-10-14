package com.san.DesignPattern.观察者模式;


/**
 * 服务号中维护了所有向它订阅消息的使用者，当服务号有新消息时，通知所有的使用者。
 * 整个架构是一种松耦合，主题的实现不依赖与使用者，当增加新的使用者时，主题的代码不需要改变；
 * 使用者如何处理得到的数据与主题无关；
 */
public class Test {


    public static void main(String[] args) {
        //模拟服务号
        ObjectFor3D objectFor3D = new ObjectFor3D();
        //客户
        Observer observer1 = new Observer1(objectFor3D);
        Observer observer2 = new Observer2(objectFor3D);

        objectFor3D.setMsg("20140420的3D号码是：127");
        objectFor3D.setMsg("20140421的3D号码是：333");
    }
}
