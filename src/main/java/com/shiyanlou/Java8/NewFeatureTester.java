package com.shiyanlou.Java8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by KouJiaxing on 2017-12-4.
 */
public class NewFeatureTester {
    static String str = "hello";

    public static void main(String[] args) {

        LambdaInterface addOne = string -> str + " test " + string;
        System.out.println(addOne.strTest("aaa"));

        str = "aaa";
        LambdaInterface addTwo = string -> str + " test " + string;
        System.out.println(addTwo.strTest("aaa"));

        JButton show = new JButton("Show");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Event handling without lambda expression is boring");
            }
        });

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(i -> System.out.println(i));

        List<String> strList = Arrays.asList("abc", "def", "ghi");
        strList.forEach(System.out::println);
        strList.forEach(new StringAdd()::addHead);
        strList.forEach(System.out::println);

        String s = "kou jia xing";
        StringAdd stringAdd = new StringAdd();
        System.out.println();

        /*//多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8, too much code for too little to do");
            }
        }).start();

        new Thread(() -> System.out.println("In Java8,Lambda expression rocks!!")).start();

        Thread thread = new Thread(() -> System.out.println("hahaha"));

        thread.start();

        Runnable runnable = () -> System.out.println("hehehehehehe");

        Thread ttt = new Thread(runnable);
        ttt.start();*/


        list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("All of the numbers:");

        eval(list, n -> true);

        System.out.println("Even numbers:");
        eval(list, n -> n % 2 == 0);

        System.out.println("Numbers that greater than  5:");
        eval(list, n -> n > 5);

        Predicate<String> predicate = s1 -> s1.length() > 5;

        List<String> strings = Arrays.asList("1", "22", "4444", "55555", "666666", "7777777");
        strings.forEach(str -> {
            if (predicate.test(str)) System.out.println(str);
        });
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.println(n);
            }
        }
    }

    public static String addHello(String s) {
        return "Hello " + s;
    }


}
