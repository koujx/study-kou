package com.javaStudy.DesignPatterns.Singleton;

/**
 * Created by koujx on 2016/5/4.
 * 单例模式：
 * 保证一个类仅有个实例，并向外提供一个访问它的全局访问点。
 * <p/>
 * 1.饿汉模式
 * 最常见、最简单的单例模式写法之一。顾名思义，“饿汉模式” 就是很 “饥渴”，所以一上来就需要给它新建一个实例。
 * 但这种方法有一个明显的缺点，那就是不管有没有调用过获得实例的方法（本例中为 getWife() ），每次都会新建一个实例。
 */
public class Wife {
    //一开始就新建一个实例
    private static final Wife wife = new Wife();

    private Wife() {
    }

    //获取实例
    public static Wife getWife() {
        return wife;
    }
}
