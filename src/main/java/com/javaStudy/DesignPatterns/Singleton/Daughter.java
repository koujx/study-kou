package com.javaStudy.DesignPatterns.Singleton;

/**
 * Created by koujx on 2016/5/4.
 * <p/>
 * 4.双重检验锁（double check）
 * 线程安全的懒汉模式解决了多线程的问题，看起来完美了。但是它的效率不高，每次调用获得实例的方法 getWife() 时都要进行同步，
 * 但是多数情况下并不需要同步操作（例如我的 Daughter 实例并不为空可以直接使用的时候，就不需要给 getDaughter() 加同步方法，直接返回 wife 实例就可以了）。
 * 所以只需要在第一次新建实例对象的时候，使用同步方法。
 */
public class Daughter {

    //volatile 关键字，它的作用就是防止编译器自行优化代码
    private volatile static Daughter daughter;

    private Daughter() {
    }

    public static Daughter getDaughter() {
        //第一个校验锁，如果不为空，直接返回实例为空时才进入下一步
        if (daughter == null) {
            synchronized (Daughter.class) {
                //第二个校验锁，因为可能有多个线程进入if语句，这样可以避免等待中的多个线程都创建实例。
                if (daughter == null) {
                    daughter = new Daughter();
                }
            }
        }
        return daughter;
    }

}
