package com.san.com.观察者模式.内置观察者模式;


import java.util.Observable;


/**
 * 彩票服务中心 服务主题号
 */
public class SubjectFor3d extends Observable {

    private String msg;

    public String getMsg(){
        return msg;
    }

    /**
     * 主题消息更新
     * @param msg
     */
    public void setMsg(String msg){
        this.msg = msg;
        setChanged();
        notifyObservers();
    }

}
