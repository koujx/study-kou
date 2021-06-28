package com.problems.jianZhiOffer;

import java.util.ArrayList;
/*
* created by koujx on 2016/3/21.
* 任意2n个整数，从其中选出n个整数，使得选出的n个整数和同剩下的n个整数之和的差最小。
* */

public class MinDifference {

    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            n.add((int) (Math.random() * 100));
            System.out.println(n.get(i));
        }
        System.out.println("-------------------------------");
        MinDifference minD = new MinDifference();
        ArrayList<Integer> n1 = minD.solution(n);
        for (int i = 0; i < n1.size(); i++) {
            System.out.println(n1.get(i));
        }
        System.out.println(n1.toString());
    }

    public ArrayList<Integer> solution(ArrayList<Integer> n) {
        ArrayList<Integer> n1 = new ArrayList<Integer>(), n2 = new ArrayList<Integer>();
        n = sort(n);
        n1.add(n.get(0));
        n2.add(n.get(1));
        int sum1 = n1.get(0);
        int sum2 = n2.get(0);
        for (int i = 2; i < n.size(); i++) {
            if (n1.size() >= n.size() / 2) {
                return n1;
            }
            if (n2.size() >= n.size() / 2) {
                n1.add(n.get(i));
                sum1 += n.get(i);
            } else {
                if (sum1 < sum2) {
                    n1.add(n.get(i));
                    sum1 += n.get(i);
                } else {
                    n2.add(n.get(i));
                    sum2 += n.get(i);
                }
            }
        }
        return n1;
    }

    public ArrayList<Integer> sort(ArrayList<Integer> nl) {
        for (int i = 0; i < nl.size() - 1; i++) {
            for (int j = nl.size() - 1; j > i; j--) {
                if (nl.get(j) < nl.get(j - 1)) {
                    int temp = nl.get(j);
                    nl.set(j, nl.get(j - 1));
                    nl.set(j - 1, temp);
                }
            }
        }
        return nl;
    }

}

