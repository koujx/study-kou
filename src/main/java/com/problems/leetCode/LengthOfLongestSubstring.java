package com.problems.leetCode;

/**
 * Created by koujx on 2016/1/22.
 * 3.Longest Substring Without Repeating Characters
 */

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int length = 1;
        int min = 0;
        int max = min + 1;

        if (s.isEmpty()) return 0;

        while (max < s.length()) {
            for (int i = min; i < max; i++)
                if (s.charAt(max) == s.charAt(i)) {
                    min = i + 1;
                    break;
                }
            int l = max - min + 1;
            length = (l > length) ? l : length;
            max++;
        }
        return length;
    }
}
