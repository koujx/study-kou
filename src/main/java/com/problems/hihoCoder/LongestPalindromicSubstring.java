package com.problems.hihoCoder;

import java.util.Scanner;

/**
 * Created by 902 on 2016/3/31.
 * #1032 : 最长回文子串
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n>0){
            String string = in.next();
            System.out.println(longestPalindromicSub(string));
            n--;
        }
    }

    public static int longestPalindromicSub(String string) {
        int length = 0;

        return length;
    }
}
