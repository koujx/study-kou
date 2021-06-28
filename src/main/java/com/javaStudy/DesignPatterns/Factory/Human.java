package com.javaStudy.DesignPatterns.Factory;

/**
 * Created by koujx on 2016/5/4.
 * <p/>
 * 工厂模式（Factory Pattern）
 * 在面向对象程序设计中，工厂通常是一个用来创建其他对象的对象。
 * 工厂模式根据不同的参数来实现不同的分配方案和创建对象。
 * 例如用工厂来创建 '人' 这个对象，如果我们需要一个男人对象，工厂就会为我们创建一个男人；如果我们需要一个女人，工厂就会为我们生产一个女人。
 * <p/>
 * 抽象产品Human
 */

public abstract class Human {
    public abstract void eat();

    public abstract void sleep();

    public abstract void beat();
}


