package com.problems.leetCode;

/**
 * Created by koujx  on 2016/1/22.
 * 66. Plus One
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] result1 = new int[digits.length];
        int[] result2 = new int[digits.length + 1];
        int add = 1;
        for (int i = result1.length - 1; i >= 0; i--) {
            result1[i] = (digits[i] + add) % 10;
            result2[i + 1] = result1[i];
            add = (digits[i] + add) / 10;
        }
        if (add == 1) {
            result2[0] = 1;
            return result2;
        } else return result1;
    }
}
