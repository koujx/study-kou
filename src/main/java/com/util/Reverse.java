package com.util;

/**
 * Created by koujx  on 2016/1/22.
 * 字符串反转
 */
public class Reverse {
    public static String stringReverse(String a) {
        if (a.length() < 2) {
            return a;
        } else {
            return stringReverse(a.substring(1)) + a.charAt(0);
        }
    }

    public static String stringReverse1(String a) {
        if (a.length() < 2) {
            return a;
        } else {
            char[] aChar = a.toCharArray();
            for (int i = 0; i < a.length()/2; i++) {
                char temp = aChar[i];
                aChar[i]=aChar[a.length() - 1 - i] ;
                aChar[a.length() - 1 - i] = temp;
            }
            return String.valueOf(aChar);
        }
    }

    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(str);
        System.out.println(stringReverse(str));
        System.out.println(stringReverse1(str));
    }
}
