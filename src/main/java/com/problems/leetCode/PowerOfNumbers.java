package com.problems.leetCode;

/**
 * Created by koujx  on 2016/1/22.
 * power of *
 */
public class PowerOfNumbers {

    /* 231. Power of Two */
    public boolean isPowerofTwo(int n) {
        if (n > 0) {
            while (n % 2 == 0 && n != 0) {
                n /= 2;
            }
            return (n > 1) ? false : true;
        } else {
            return false;
        }
    }

    /* 326. Power of Three */
    public boolean isPowerofThree(int n) {
        if (n > 0) {
            while (n % 3 == 0 && n != 0) n /= 3;
            return n <= 1;
        } else return false;
    }

}
