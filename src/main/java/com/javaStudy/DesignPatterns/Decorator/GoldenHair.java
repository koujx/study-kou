package com.javaStudy.DesignPatterns.Decorator;

/**
 * Created by koujx on 2016/5/5.
 */
public class GoldenHair extends GirlDecorator {
    private Girl girl;
    public GoldenHair(Girl girl){
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return "金发的"+this.girl.getDescription();
    }
}
