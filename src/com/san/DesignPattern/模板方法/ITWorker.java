package com.san.DesignPattern.模板方法;

public class ITWorker extends Worker {
    public ITWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name+"写程序-测BUG");
    }

    @Override
    public boolean isNeedPrintDate()
    {
        return true;
    }

}
