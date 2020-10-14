package com.san.DesignPattern.观察者模式;

import java.util.ArrayList;
import java.util.List;

public class ObjectFor3D implements Subject {

    //关键代码：在抽象类里有一个 ArrayList 存放观察者们。
    private List<Observer> observers = new ArrayList<Observer>();

    //3D彩票号
    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index > 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    /**
     * 主题更新消息
     * @param msg
     */
    public void setMsg(String msg){
        this.msg = msg;
        notifyObservers();
    }

}
