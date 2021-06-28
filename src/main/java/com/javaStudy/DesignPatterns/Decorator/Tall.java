package com.javaStudy.DesignPatterns.Decorator;

/**
 * Created by koujx on 2016/5/5.
 */
public class Tall extends GirlDecorator {
    private Girl girl;
    public Tall(Girl girl){
        this.girl = girl;
    }
    @Override
    public String getDescription() {
        return "高个子的"+this.girl.getDescription();
    }
}
