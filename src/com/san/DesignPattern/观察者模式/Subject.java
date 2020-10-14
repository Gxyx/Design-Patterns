package com.san.DesignPattern.观察者模式;


/**
 * 主题接口，所有主题必须实现此接口
 */

public interface Subject {

    /**
     * 注册一个观察者
     * @param observer
     */
     void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     * @param observer
     */
    void removeObserver(Observer observer);


    /**
     * 通知所有的观察着
     */
     void notifyObservers();
}
