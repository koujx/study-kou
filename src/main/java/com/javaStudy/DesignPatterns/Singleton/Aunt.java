package com.javaStudy.DesignPatterns.Singleton;

/**
 * Created by koujx on 2016/5/4.
 * <p/>
 * 6.枚举
 * 通过 Aunt.INSTANCE 来访问实例对象，这比 getAunt() 要简单得多.
 * 而且创建枚举默认就是线程安全的，还可以防止反序列化带来的问题。
 */
public enum Aunt {
    INSTANCE;

    //自定义的任意方法
    public void Method() {
    }
}
