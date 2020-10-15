package com.san.DesignPattern.备忘录模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录模式
 *
 * Caretaker 对象负责从 Memento 中恢复对象的状态
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
