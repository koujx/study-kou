package com.problems.jianZhiOffer;

import java.util.Scanner;

/**
 * Created by 902 on 2016/3/22.
 * С�׵�����֮·
 * С�׾���������������Ϸ.��һ��,������һ�������������Ϸ,���Ľ�ɫ�ĳ�ʼ����ֵΪ a.
 * �ڽ�������һ��ʱ����,��������������n������,ÿ������ķ�����Ϊb1,b2,b3...bn.
 * ��������Ĺ��������biС�ڵ���С�׵ĵ�ǰ����ֵc,��ô���������ɴ�ܹ���,����ʹ���Լ�������ֵ����bi;
 * ���bi����c,����Ҳ�ܴ�ܹ���,����������ֵֻ������bi ��c�����Լ��.
 * ��ô��������,��һϵ�еĶ�����,С�׵���������ֵΪ����?
 * <p/>
 * ��������:
 * ����ÿ������,��һ������������n(1��n<100000)��ʾ�����������a��ʾС�׵ĳ�ʼ����ֵ.
 * �ڶ���n������,b1,b2...bn(1��bi��n)��ʾÿ������ķ�����
 * <p/>
 * �������:
 * ����ÿ������,���һ��.ÿ�н�����һ������,��ʾС�׵���������ֵ
 * <p/>
 * ��������:
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
