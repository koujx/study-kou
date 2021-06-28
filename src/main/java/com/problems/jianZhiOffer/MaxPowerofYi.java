package com.problems.jianZhiOffer;

import java.util.Scanner;

/**
 * Created by 902 on 2016/3/22.
 * 小易的升级之路
 * 小易经常沉迷于网络游戏.有一次,他在玩一个打怪升级的游戏,他的角色的初始能力值为 a.
 * 在接下来的一段时间内,他将会依次遇见n个怪物,每个怪物的防御力为b1,b2,b3...bn.
 * 如果遇到的怪物防御力bi小于等于小易的当前能力值c,那么他就能轻松打败怪物,并且使得自己的能力值增加bi;
 * 如果bi大于c,那他也能打败怪物,但他的能力值只能增加bi 与c的最大公约数.
 * 那么问题来了,在一系列的锻炼后,小易的最终能力值为多少?
 * <p/>
 * 输入描述:
 * 对于每组数据,第一行是两个整数n(1≤n<100000)表示怪物的数量和a表示小易的初始能力值.
 * 第二行n个整数,b1,b2...bn(1≤bi≤n)表示每个怪物的防御力
 * <p/>
 * 输出描述:
 * 对于每组数据,输出一行.每行仅包含一个整数,表示小易的最终能力值
 * <p/>
 * 输入例子:
 * 3 50
 * 50 105 200
 * 5 20
 * 30 20 15 40 100
 */
public class MaxPowerofYi {
    public static void solution() {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int num = input.nextInt();
            int preP = input.nextInt();
            int[] nums = new int[num];
            for (int i = 0; i < num; i++) {
                nums[i] = input.nextInt();
            }
            int currentP = preP;
            for (int i = 0; i < num; i++) {
                if (currentP > nums[i]) {
                    currentP += nums[i];
                } else {
                    currentP += greatestCommonDivisor(currentP, nums[i]);
                }
            }
            System.out.println(currentP);
        }
    }

    public static int greatestCommonDivisor(int n1, int n2) {
        if (n1 == n2) return n1;
        else {
            int divisor;
            if (n1 > n2) {
                divisor = n2;
            } else {
                divisor = n1;
            }
            while (divisor > 1) {
                if (n1 % divisor == 0 && n2 % divisor == 0) {
                    return divisor;
                } else divisor--;
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        Long k = Long.valueOf(i) + 1;
//        MaxPowerofYi.solution();
        System.out.println(i);
        System.out.println(k);
        System.out.println(greatestCommonDivisor(i, j));
    }
}
