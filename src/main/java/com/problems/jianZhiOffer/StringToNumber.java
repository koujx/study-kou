package com.problems.jianZhiOffer;

/**
 * Created by koujx on 2016/5/10.
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 */
public class StringToNumber {
    public int StrToInt(String str) {
        int l = str.length();
        if (l > 0) {
            int result = 0;
            int pow = 1;
            for (int i = l - 1; i > 0; i--) {
                char c = str.charAt(i);
                int add = (c - 48);
                if (add < 10 && add >= 0) {
                    result += add * pow;
                } else return 0;
                pow *= 10;
            }
            char c = str.charAt(0);
            if (c == '+') return result;
            else if (c == '-') return -result;
            else if (c >= 48 && c < 58) return result += (c - 48) * pow;
            else return 0;
        } else return 0;
    }
}
