package com.javaStudy.DesignPatterns.Singleton;

/**
 * Created by koujx on 2016/5/4.
 * <p/>
 * 3.线程安全的懒汉模式
 * 在基本的懒汉模式上，把它设为线程同步（synchronized）
 * synchronized 的作用就是保证在同一时刻最多只有一个线程运行，这样就避免了多线程带来的问题。
 * 关于 synchronized 关键字，http://www.cnblogs.com/gnagwang/archive/2011/02/27/1966606.html.
 */
public class Son {
    private static Son son;

    private Son() {
    }

    //添加synchronized关键字
    public static synchronized Son getSon() {
        if (son == null) {
            son = new Son();
        }
        return son;
    }
}
