package com.problems.leetCode;

/**
 * created by koujx on 2016/1/22.
 * #6. zigzag conversion
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to
 * display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class Convert {
    public String convert(String text, int nRows) {
        String conversion = "";
        if (nRows == 1) conversion = text;
        else {
            int n = nRows - 1;
            for (int i = 1; i <= nRows; i++) {
                int temp1 = i;
                while (temp1 <= text.length()) {
                    conversion += text.charAt(temp1 - 1);
                    int temp2 = temp1 + 2 * nRows - 2 * i;
                    if (i != 1 && i != nRows && temp2 <= text.length()) {
                        conversion += text.charAt(temp2 - 1);
                    }
                    temp1 += 2 * n;
                }
            }
        }
        return conversion;
    }

}
