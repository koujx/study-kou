package com.javaStudy.DesignPatterns.Singleton;

/**
 * Created by koujx on 2016/5/4.
 * <p/>
 * 5.静态内部类
 * 这种方式，利用了 JVM 自身的机制来保证线程安全。
 * 因为 UncleHolder 类是私有的，除了 getUncle() 之外没有其它方式可以访问实例对象，
 * 而且只有在调用 getUncle() 时才会去真正创建实例对象。（这里类似于 “懒汉模式”）
 */
public class Uncle {

    private static class UncleHolder {
        private static final Uncle uncle = new Uncle();
    }

    private Uncle() {
    }

    public static Uncle getUncle() {
        return UncleHolder.uncle;
    }
}
