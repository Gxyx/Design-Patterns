package com.san.DesignPattern.解释器模式;

/**
 * 作为上下文中主要解释器
 */
public interface Expression {

     boolean interpret(String context);
}
