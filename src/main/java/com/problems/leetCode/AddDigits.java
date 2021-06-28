package com.problems.leetCode;

/**
 * Created by koujx on 2016/1/22.
 * 258. Add Digits
 */
public class AddDigits {

    public int addDigits(int num) {
        int n = num;
        if (n < 10) {
            return n;
        } else {
            int sum = 0;
            while (n >= 10) {
                sum += n % 10;
                n /= 10;
            }
            sum = sum + n;
            return addDigits(sum);
        }
    }
}
