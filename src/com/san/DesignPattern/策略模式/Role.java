package com.san.DesignPattern.策略模式;

/*
* 策略模式（Strategy Pattern）：定义了算法族，分别封装起来，
* 让它们之间可相互替换，此模式让算法的变化独立于使用算法的客户。
 */

// 定义上的算法族：其实就是上述例子的技能；
// 定义上的客户：其实就是RoleA，RoleB...；
// 我们已经定义了一个算法族（各种技能），
// 且根据需求可以进行相互替换，算法（各种技能）的实现独立于客户（角色）。

public abstract class Role {

    protected String name;
//    protected abstract  void display();
//    protected abstract void run();
//    protected abstract void attack();
//    protected abstract void defend();

    protected IDefendBehavior defendBehavior;
    protected IDisplayBehavior displayBehavior;
    protected IRunBehavior runBehavior;
    protected IAttackBehavior attackBehavior;

    public Role setDefendBehavior(IDefendBehavior defendBehavior)
    {
        this.defendBehavior = defendBehavior;
        return this;
    }

    public Role setDisplayBehavior(IDisplayBehavior displayBehavior)
    {
        this.displayBehavior = displayBehavior;
        return this;
    }

    public Role setRunBehavior(IRunBehavior runBehavior)
    {
        this.runBehavior = runBehavior;
        return this;
    }

    public Role setAttackBehavior(IAttackBehavior attackBehavior)
    {
        this.attackBehavior = attackBehavior;
        return this;
    }

    protected void display()
    {
        displayBehavior.display();
    }

    protected void run()
    {
        runBehavior.run();
    }

    protected void attack()
    {
        attackBehavior.attack();
    }

    protected void defend()
    {
        defendBehavior.defend();
    }


}
