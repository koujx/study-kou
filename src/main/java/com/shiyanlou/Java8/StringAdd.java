package com.shiyanlou.Java8;

/**
 * Created by KouJiaxing on 2017-12-4.
 */
public class StringAdd {
    private final static String head = "Hello ";

    public String addHead(String s) {
        s = head + s;
        System.out.println(s);
        return s;
    }
}
