package com.javaStudy.DesignPatterns.Singleton;

/**
 * Created by koujx on 2016/5/4.
 * <p/>
 * 2.懒汉模式
 * 最常见、最简单的单例模式写法之一。顾名思义，“饿汉模式” 就是很 “饥渴”，所以一上来就需要给它新建一个实例。
 * 但这种方法有一个明显的缺点，那就是不管有没有调用过获得实例的方法（本例中为 getWife() ），每次都会新建一个实例。
 */
public class Husband {
    //一开始没有新建实例
    private static Husband husband;

    private Husband() {
    }

    //需要时再新建实例
    public static Husband getHusband() {
        if (husband == null) {
            husband = new Husband();
        }
        return husband;
    }
}
