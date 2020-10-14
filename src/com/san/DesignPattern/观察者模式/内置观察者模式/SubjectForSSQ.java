package com.san.DesignPattern.观察者模式.内置观察者模式;

import java.util.Observable;

/**
 * 双色球 服务主题号
 */
public class SubjectForSSQ extends Observable {

    private String msg;

    public String getMsg() {
        return msg;
    }


    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();

    }
}
