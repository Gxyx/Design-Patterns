package com.san.DesignPattern.状态模式.status;


/**
 * 状态接口
 */
public interface State {
    /**
     * 放钱
     */
     void insertMoney();
    /**
     * 退钱
     */
     void backMoney();
    /**
     * 转动曲柄
     */
     void turnCrank();
    /**
     * 出商品
     */
     void dispense();

}
