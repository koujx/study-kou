package com.problems.leetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * created by  on 2016/1/22.
 * Write a program to check whether a given number is an ugly number.
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is
 * not ugly since it includes another prime factor 7.
 * Note that 1 is typically treated as an ugly number.
 */
public class UglyNumber {
    /* 264. Ugly Number II */
    public int nthUglyNumber(int n) {
        int number = 0;
        List<Integer> l1 = new LinkedList<Integer>();
        List<Integer> l2 = new LinkedList<Integer>();
        List<Integer> l3 = new LinkedList<Integer>();
        l1.add(1);
        l2.add(1);
        l3.add(1);
        int count = 0;
        while (count < n) {
            int min = sortThreeNumbers(l1.get(0), l2.get(0), l3.get(0));
            if (l1.get(0) == min) l1.remove(0);
            if (l2.get(0) == min) l2.remove(0);
            if (l3.get(0) == min) l3.remove(0);
            l1.add(min * 2);
            l2.add(min * 3);
            l3.add(min * 5);
            count++;
            number = min;
        }

        return number;
    }

    /* 263. Ugly Number */
    public boolean isUgly(int num) {
        if (num > 0) {
            while (num % 2 == 0) {
                num = num / 2;
            }
            while (num % 3 == 0) {
                num = num / 3;
            }
            while (num % 5 == 0) {
                num = num / 5;
            }
            if (num == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int sortThreeNumbers(int n1, int n2, int n3) {
        if (n1 <= n2 && n1 <= n3) {
            return n1;
        } else if (n2 <= n1 && n2 <= n3) {
            return n2;
        } else {
            return n3;
        }
    }
}
