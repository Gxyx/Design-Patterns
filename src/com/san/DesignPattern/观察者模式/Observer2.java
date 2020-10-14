package com.san.DesignPattern.观察者模式;

public class Observer2 implements Observer {

    private Subject subject;

    public Observer2(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("Observer2 得到号码 --> " + msg + "记下来.....");
    }
}
