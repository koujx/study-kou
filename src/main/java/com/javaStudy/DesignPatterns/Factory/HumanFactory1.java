package com.javaStudy.DesignPatterns.Factory;

/**
 * Created by koujx on 2016/5/4.
 * <p/>
 * 简单工厂
 * 根据需求生产相应产品Man或Woman。
 */
public class HumanFactory1 {

    public static Human creatHuman(String gender) {
        Human human = null;
        if (gender.equals("man")) {
            human = new Man();
        } else if (gender.equals("woman")) {
            human = new Woman();
        }
        return human;
    }
}
