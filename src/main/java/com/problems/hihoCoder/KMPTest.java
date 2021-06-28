package com.problems.hihoCoder;

import java.util.Scanner;

/**
 * Created by 902 on 2016/3/30.
 * #1015 : KMP算法
 */
public class KMPTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n > 0) {
            String pattern = in.next();
            String target = in.next();
            int counts = KMP_Counts(target, pattern);
            System.out.println(counts);
            n--;
        }

    }

    /**
     * KMP匹配字符串
     *
     * @param target 主串
     * @param pattern 模式串
     * @return 返回主串中模式串出线的次数
     */
    public static int KMP_Counts(String target, String pattern) {
        int i = 0;
        int j = 0;
        int counts = 0;
        char[] s = target.toCharArray();
        char[] t = pattern.toCharArray();
        int[] next = next(pattern);
        while (i <= s.length - 1) {
            while ((j == -1 || s[i] == t[j])) {
                j++;
                i++;
                if (j >= t.length) {
                    counts++;
                    j = next[j];
                }
                if (i >= s.length) break;
            }
            j = next[j];
        }
        return counts;
    }


    //根据f(j)计算模式串pattern的跳转表next[]
    public static int[] next(String pattern) {
        int nums = pattern.length();
        int[] next = new int[nums + 1];
        int fj = 0;
        next[0] = 0;
        int i = 1;

        while (i < nums) {
            while (fj > 0 && pattern.charAt(i - 1) != pattern.charAt(fj - 1)) {
                fj = next[fj - 1];
            }

            ++fj;
            ++i;
            if (pattern.charAt(i - 1) == pattern.charAt(fj - 1)) {
                next[i - 1] = next[fj - 1];
            } else {
                next[i - 1] = fj;
            }
        }

        //pattern末尾处理
        while (fj > 0 && pattern.charAt(i - 1) != pattern.charAt(fj - 1)) {
            fj = next[fj - 1];
        }
        ++fj;
        ++i;
        next[i - 1] = fj;
        for (int j = 0; j < next.length; j++) {
            next[j] = next[j] - 1;
        }
        return next;
    }
}
