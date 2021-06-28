package com.problems.leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by koujx on 2016/4/25.
 * #344. Reverse String
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 * <p/>
 * #345. Reverse Vowels of a String
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * Example 1:
 * Given s = "hello", return "holle".
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 */
public class ReverseString {
    //#344. Reverse String
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int sum = chars.length;
        for (int i = 0; i < sum / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[sum - 1 - i];
            chars[sum - 1 - i] = temp;
        }
        return String.valueOf(chars);
    }

    //#345. Reverse Vowels of a String
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        List<Integer> vowels = new ArrayList<Integer>();
        HashSet<Character> vowelsHash = new HashSet();
        vowelsHash.add('a');
        vowelsHash.add('o');
        vowelsHash.add('e');
        vowelsHash.add('u');
        vowelsHash.add('i');
        vowelsHash.add('A');
        vowelsHash.add('O');
        vowelsHash.add('E');
        vowelsHash.add('U');
        vowelsHash.add('I');
        int sum = chars.length;
        for (int i = 0; i < sum; i++) {
            if (vowelsHash.contains(chars[i])) vowels.add(i);
        }
        sum = vowels.size();
        for (int i = 0; i < sum / 2; i++) {
            char temp = chars[vowels.get(i)];
            chars[vowels.get(i)] = chars[vowels.get(sum - 1 - i)];
            chars[vowels.get(sum - 1 - i)] = temp;
        }
        return String.valueOf(chars);
    }
}
