package com.problems.leetCode;

import static com.util.Reverse.stringReverse;

/**
 * Created by koujx on 2016/1/22.
 * excel sheet column number&title
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 */
public class ExcelSheet {
    //171. Excel Sheet Column Number
    public int titleToNumber(String s) {
        if ("".equals(s)) {
            return 0;
        }

        int n = 0;
        s = stringReverse(s);
        for (int i = 0; i < s.length(); i++) {
            int temp = (int) Math.pow(26, i);
            n += (s.charAt(i) - 64) * temp;
        }
        return n;
    }

    //168. Excel Sheet Column Title
    public String convertToTitle(int n) {
        if (n <= 0) {
            return null;
        }
        String title = "";
        int convert = n;
        while (convert > 0) {
            int i = (convert) % 26;
            if (i == 0) {
                title = "Z" + title;
                convert = convert / 26 - 1;
            } else {
                title = (char) (i + 64) + title;
                convert = convert / 26;
            }
        }
        return title;
    }
}
