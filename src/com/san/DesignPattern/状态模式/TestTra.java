package com.san.DesignPattern.状态模式;

public class TestTra {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(10);
        machine.insterMoney();
        machine.backMoney();

        System.out.println("-----------------");

        machine.insterMoney();
        machine.turnCrank();

        System.out.println("------------压力测试-------------");
        machine.insterMoney();;
        machine.insterMoney();
        machine.turnCrank();
        machine.turnCrank();
        machine.backMoney();
    }
}
