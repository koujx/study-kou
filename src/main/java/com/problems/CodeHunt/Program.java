package com.problems.codeHunt;

/**
 * Created by koujx on 2016/4/19.
 */

public class Program {
    public static int[] Puzzle(int[] a) {
        int[] result = a;
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (Math.abs(a[j]) < Math.abs(a[j - 1])) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        return result;
    }

    public static String Puzzle(String s) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            Character a = s.charAt(i);
            if (Character.isLowerCase(a)) result.append(Character.toUpperCase(a));
            else result.append(Character.toLowerCase(a));
        }
        return result.toString();
    }

    public static String Puzzle(String s, int i) {
        String str = s.trim();
        if (!str.equals("")) {
            String[] ss = str.split("\\s+");
            if (i < ss.length) return ss[i];
            else return null;
        } else return null;
    }


    public static void main(String[] args) {
        String s = "  H  I";
        System.out.println(Puzzle(s, 2));
    }

}
