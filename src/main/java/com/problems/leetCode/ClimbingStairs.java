package com.problems.leetCode;

/**
 * created by koujx on 2016/3/11.
 * 70.Climbing Stairs
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
	public int climbStairs1(int n) {
		if (n < 0) return 0;
		if (n < 2) return 1;
		else {
			int pre = 1;
			int current = 1;
			for (int i = 2; i <= n; i++) {
				int temp = pre + current;
				pre = current;
				current = temp;
			}
			return current;
		}
	}
	//递归，时间溢出
	public int climbStairs2(int n) {
		if (n<=0)return 0;
		if (n==1)return 1;
		if (n==2)return 2;
		else return climbStairs2(n-1)+climbStairs2(n-2);
	}
}
