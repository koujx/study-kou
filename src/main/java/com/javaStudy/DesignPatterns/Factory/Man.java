package com.javaStudy.DesignPatterns.Factory;

/**
 * Created by koujx on 2016/5/4.
 * <p/>
 * 具体产品-Man
 * 继承抽象类Human，重写父类抽象方法eat(),sleep()和beat().
 */
public class Man extends Human {
    @Override
    public void eat() {
        System.out.println("Man can eat");
    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        System.out.println("Man can sleep");
    }

    @Override
    public void beat() {
        // TODO Auto-generated method stub
        System.out.println("Man can beat");
    }
}
