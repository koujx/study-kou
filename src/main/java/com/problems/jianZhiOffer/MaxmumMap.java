package com.problems.jianZhiOffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by koujx on 2016/4/29.
 * 最大映射
 * 有 n 个字符串，每个字符串都是由 A-J 的大写字符构成。现在你将每个字符映射为一个 0-9 的数字，不同字符映射为不同的数字。这样每个字符串就可以看做一个整数，唯一的要求是这些整数必须是正整数且它们的字符串不能有前导零。现在问你怎样映射字符才能使得这些字符串表示的整数之和最大？
 * <p/>
 * 输入描述:
 * 每组测试用例仅包含一组数据，每组数据第一行为一个正整数 n ， 接下来有 n 行，每行一个长度不超过 12 且仅包含大写字母 A-J 的字符串。 n 不大于 50，且至少存在一个字符不是任何字符串的首字母。
 * <p/>
 * 输出描述:
 * 输出一个数，表示最大和是多少。
 * <p/>
 * 输入例子:
 * 2
 * ABC
 * BCA
 * <p/>
 * 输出例子:
 * 1875
 */

public class MaxmumMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            String[] strs = new String[num];
            for (int i = 0; i < num; i++) {
                strs[i] = in.next();
            }
            ArrayList<HashMap<Character, Integer>> sumS = new ArrayList<HashMap<Character, Integer>>();

            for (int i = 0; i < 12; i++) {
                HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
                for (int j = 0; j < num; j++) {
                    if (strs[j].length() <= i) {
                        continue;
                    } else {
                        char ch = strs[j].charAt(strs[j].length() - i - 1);
                        if (hashMap.containsKey(ch)) {
                            int n = hashMap.get(ch);
                            hashMap.put(ch, n + 1);
                        } else {
                            hashMap.put(ch, 1);
                        }
                    }
                }
                sumS.add(hashMap);
            }

            int[] firstChar = new int[10];
            for (int i = 0; i < num; i++) {
                char first = strs[i].charAt(0);
                firstChar[first - 'A']++;
            }

            long[] bigIntegers = new long[10];
            for (int i = 0; i < sumS.size(); i++) {
                HashMap<Character, Integer> hashMap = sumS.get(i);
                if (hashMap.containsKey('A')) {
                    bigIntegers[0] += hashMap.get('A') * (long) Math.pow(10, i);
                }
                if (hashMap.containsKey('B')) {
                    bigIntegers[1] += hashMap.get('B') * (long) Math.pow(10, i);
                }
                if (hashMap.containsKey('C')) {
                    bigIntegers[2] += hashMap.get('C') * (long) Math.pow(10, i);
                }
                if (hashMap.containsKey('D')) {
                    bigIntegers[3] += hashMap.get('D') * (long) Math.pow(10, i);
                }
                if (hashMap.containsKey('E')) {
                    bigIntegers[4] += hashMap.get('E') * (long) Math.pow(10, i);
                }
                if (hashMap.containsKey('F')) {
                    bigIntegers[5] += hashMap.get('F') * (long) Math.pow(10, i);
                }
                if (hashMap.containsKey('G')) {
                    bigIntegers[6] += hashMap.get('G') * (long) Math.pow(10, i);
                }
                if (hashMap.containsKey('H')) {
                    bigIntegers[7] += hashMap.get('H') * (long) Math.pow(10, i);
                }
                if (hashMap.containsKey('I')) {
                    bigIntegers[8] += hashMap.get('I') * (long) Math.pow(10, i);
                }
                if (hashMap.containsKey('J')) {
                    bigIntegers[9] += hashMap.get('J') * (long) Math.pow(10, i);
                }
            }

            int zero = 0;
            for (int i = 0; i < 10; i++) {
                if (firstChar[i] <= firstChar[zero]&&bigIntegers[i]<bigIntegers[zero])
                    zero = i;
            }

            bigIntegers[zero] = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 9; j > i; j--) {
                    if (bigIntegers[j] > bigIntegers[j - 1]) {
                        long temp = bigIntegers[j];
                        bigIntegers[j] = bigIntegers[j - 1];
                        bigIntegers[j - 1] = temp;
                    }
                }
            }
            long sum = 0;
            int num1 = 9;
            for (int i = 0; i < 9; i++) {
                sum += bigIntegers[i] * num1;
                num1--;
            }
            System.out.println(sum);
        }
    }
}

