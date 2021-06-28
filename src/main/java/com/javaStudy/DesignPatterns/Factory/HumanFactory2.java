package com.javaStudy.DesignPatterns.Factory;

import java.io.IOException;

/**
 * Created by koujx on 2016/5/4.
 * <p/>
 * 工厂方法模式
 * 工厂方法模式克服了简单工厂模式违背开放-封闭原则的缺点，又保持了封装对象创建过程的优点。
 * 优点：集中封装了对象的创建，使得要更换对象时，不需要大的改动，降低了客户程序和产品对象间的耦合。
 * 缺点：每加一类产品，就需要增加一个产品工厂的类，增加了额外的开发量。
 */
public abstract class HumanFactory2 {
    abstract class HumanFactory22 {
        public abstract Human creatHuman(String gender) throws IOException;
    }

    class ManFactory extends HumanFactory22 {
        @Override
        public Human creatHuman(String gender) throws IOException {
            return new Man();
        }
    }

    class WomanFactory extends HumanFactory22 {
        @Override
        public Human creatHuman(String gender) throws IOException {
            return new Woman();
        }
    }
}
