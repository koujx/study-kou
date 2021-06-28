package com.problems.leetCode;

import java.util.LinkedList;
import java.util.List;

import static com.util.Loop.isLoop;

/**
 * Created by koujx on 2016/1/22
 * 202. Happy Number
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        List<Integer> l = new LinkedList<Integer>();
        l.add(1);
        int num = n;
        while (!isLoop(l, num)) {
            l.add(num);
            int sum = 0;
            while (num >= 10) {
                sum = sum + (int) Math.pow(num % 10, 2);
                num = num / 10;
            }
            sum = sum + num * num;
            num = sum;
        }
        return num == 1;
    }
}