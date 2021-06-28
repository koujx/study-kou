package com.problems.leetCode;

/**
 * Created by koujx on 2016/1/22.
 * 67. Add Binary
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        if (a.isEmpty()) {
            return b;
        } else if (a == null) {
            return b;
        }
        if (b == null || b.isEmpty()) {
            return a;
        }

        String result = "", aString = a, bString = b;
        int add = 0;
        int length = (a.length() > b.length()) ? a.length() : b.length();
        while (length > aString.length()) {
            aString = "0" + aString;
        }
        while (length > bString.length()) {
            bString = "0" + bString;
        }
        for (int i = length - 1; i >= 0; i--) {
            String aa = aString.substring(i, i + 1);
            String bb = bString.substring(i, i + 1);
            String sum;
            if (add == 0) {
                if (aa.equals("1") && bb.equals("1")) {
                    sum = "0";
                    add = 1;
                } else {
                    sum = (aa.equals(bb)) ? "0" : "1";
                    add = 0;
                }
            } else {
                if (aa.equals("0") && bb.equals("0")) {
                    sum = "1";
                    add = 0;
                } else {
                    sum = (aa.equals(bb)) ? "1" : "0";
                    add = 1;
                }
            }
            result = sum + result;
        }
        if (add != 0) {
            result = String.format("1%s", result);
        }
        return result;
    }
}
