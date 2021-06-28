package com.problems.jianZhiOffer;

import java.util.ArrayList;

/**
 * Created by koujx on 2016/5/11.
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==1) odd.add(array[i]);
            else even.add(array[i]);
        }
        for (int i = 0; i < odd.size(); i++) {
            array[i] = odd.get(i);
        }
        for (int i = 0; i < even.size(); i++) {
            array[i + odd.size()] = even.get(i);
        }
    }
}
