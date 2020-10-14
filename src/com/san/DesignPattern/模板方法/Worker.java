package com.san.DesignPattern.模板方法;

import java.util.Date;

/**
 * 定义：定义了一个算法的骨架，而将一些步骤延迟到子类中，
 * 模版方法使得子类可以在不改变算法结构的情况下，重新定义算法的步骤。
 * 模版方法定义了一个算法的步骤，并且允许子类为一个或多个步骤提供实现
 */

//算法骨架
public abstract class Worker {

    protected String name;

    public Worker(String name){
        this.name = name;
    }
    /**
     * 记录一天的工作
     */
    public final void workOneDay(){
        System.out.println("-----------------work start ---------------");
        enterCompany();
        computerOn();
        work();
        computerOff();
        exitCompany();
        System.out.println("-----------------work end ---------------");
    }
    /**
     * 工作
     */
    public abstract void work();

    /**
     * 关闭电脑
     */
    private void computerOff(){
        System.out.println(name + "关闭电脑");
    }

    /**
     * 打开电脑
     */
    private void computerOn(){
        System.out.println(name+"打开电脑");
    }

    /**
     * 进入公司
     */
    public void enterCompany()
    {
        System.out.println(name + "进入公司");
    }

    /**
     * 模版方式里面也可以可选的设置钩子，
     * 比如现在希望记录程序员离开公司的时间，我们就可以在超类中添加一个钩子：
     * @return
     */
    //关于钩子，超类中可提供默认实现或者空实现，
    // 子类可覆盖或者不覆盖，具体根据需求来定。
    public boolean isNeedPrintDate(){
        return false;
    }

    /**
     * 离开公司
     */
    public void exitCompany()
    {
        if (isNeedPrintDate())
        {
            System.out.print(new Date().toLocaleString()+"-->");
        }
        System.out.println(name + "离开公司");

    }


}
