package com.javaStudy.DesignPatterns.Factory;

/**
 * Created by koujx on 2016/5/4.
 *
 * 具体产品-Woman
 * 继承抽象类-Human，重写父类抽象方法eat(),sleep()和beat()。
 */
public class Woman extends Human {

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Woman can eat");
    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        System.out.println("Woman can sleep");
    }

    @Override
    public void beat() {
        // TODO Auto-generated method stub
        System.out.println("Woman can beat");
    }
}
