package com.problems.leetCode;

import java.util.Arrays;

/**
 * created by koujx on 2016/1/26.
 * #242. Valid Anagram
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */
public class Anagram {
    //Sort
    public boolean isAnagram(String s, String t) {
        if ("".equals(s) && "".equals(t)) return true;
        else {
            char[] m = s.toCharArray();
            char[] n = t.toCharArray();
            Arrays.sort(m);
            Arrays.sort(n);
            return String.valueOf(m).equals(String.valueOf(n));
        }
    }

/*
    //HashMap
    public boolean isAnagram(String s, String t) {
        if (s == null && t == null) return true;
        else if (s.length() != t.length()) return false;
        else {
            HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
            for (int i = 0; i < s.length(); i++) {
                char m = s.charAt(i);
                if (sMap.containsKey(m)) sMap.put(m, sMap.get(m) + 1);
                else sMap.put(m, 1);
            }
            for (int i = 0; i < t.length(); i++) {
                char n = t.charAt(i);
                if (!sMap.containsKey(n)) {
                    return false;
                } else {
                    int count = sMap.get(n);
                    if (count > 1) sMap.put(n,count-1);
                    else sMap.remove(n);
                }
            }
            return sMap.isEmpty();
        }
    }
*/
}
