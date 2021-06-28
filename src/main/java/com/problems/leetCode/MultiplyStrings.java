package com.problems.leetCode;

import static com.util.Reverse.stringReverse;
import static java.lang.String.*;

/**
 * Created by koujx on 2016/1/22.
 * 43. Multiply Strings
 */
public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int length = (num1.length() > num2.length()) ? num1.length() : num2.length();
        String result = "";
        String num1R = stringReverse(num1);
        String num2R = stringReverse(num2);
        while (length > num1R.length()) num1R = num1R + "0";
        while (length > num2R.length()) num2R = num2R + "0";
        int[] mul = new int[length * 2];
        int add = 0;
        for (int i = 0; i < length; i++) {
            int sum = add;
            for (int j = 0; j <= i; j++) {
                int n1 = num1R.charAt(j) - 48;
                int n2 = num2R.charAt(i - j) - 48;
                sum += n1 * n2;
            }
            mul[i] = sum % 10;
            add = sum / 10;
        }
        for (int i = length; i < length * 2; i++) {
            int sum = add;
            for (int j = i + 1 - length; j < length; j++) {
                int n1 = num1R.charAt(j) - 48;
                int n2 = num2R.charAt(i - j) - 48;
                sum += n1 * n2;
            }
            mul[i] = sum % 10;
            add = sum / 10;
        }
        for (int aMul : mul) result += valueOf(aMul);
        result = stringReverse(result);
        if (add != 0) return valueOf(add) + result;
        else {
            int p = 0;
            while (result.charAt(p) == 48) {
                p++;
                if (p == result.length()) return "0";
            }
            return result.substring(p);
        }

    }

}
