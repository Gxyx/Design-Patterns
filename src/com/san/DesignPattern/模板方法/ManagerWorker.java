package com.san.DesignPattern.模板方法;

public class ManagerWorker extends Worker {
    public ManagerWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + "打dota...");
    }
}
