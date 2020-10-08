package com.san.com.观察者模式;

/*
    模拟使用者
 */
public class Observer1 implements Observer {

    private Subject subject;

    public Observer1(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("Observer1 得到号码 --> " + msg + "记下来");
    }
}
