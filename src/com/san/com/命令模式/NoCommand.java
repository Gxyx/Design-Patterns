package com.san.com.命令模式;

/**
 * NoCommand对象，叫做空对象，这个对象的好处就是，
 * 我们不用执行前都判断个if(!=null)，并且提供了一致的操作。
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }
}
