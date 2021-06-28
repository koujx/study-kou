package com.javaStudy.DesignPatterns.Decorator;

/**
 * Created by koujx on 2016/5/5.
 */
public class test {
    public static void main(String[] args){
        Girl g1 = new AmericanGirl();
        System.out.println(g1.getDescription());

        Girl g2 = new GoldenHair(g1);
        System.out.println(g2.getDescription());

        Girl g3 = new Tall(g2);
        System.out.println(g3.getDescription());
    }
}
