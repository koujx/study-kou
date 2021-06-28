package com.problems;

import java.util.Scanner;

/**
 * Created by koujx on 2016/4/13.
 */
public class Huawei {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int myHP = in.nextInt();
            int magic = in.nextInt();
            int bossHP = in.nextInt();
            int round = 0;
            while (bossHP > 0) {
                if (magic >= 10) {
                    bossHP -= 60;
                    magic -= 10;
                    round++;
                } else {
                    if (magic >= 6 && bossHP > 34) {
                        bossHP -= 60;
                        magic = magic - 6;
                        round += 2;
                    } else if (magic >= 2 && bossHP > 51) {
                        bossHP -= 60;
                        magic -= 2;
                        round += 3;
                    } else if (bossHP > 119) {
                        bossHP -= 120;
                        round += 7;
                    } else {
                        bossHP -= 17;
                        round++;
                    }
                }
            }
            int round2 = 1;
            while (round2 < round+1) {
                if (round2 % 5 == 0) {
                    myHP -= 30;
                } else {
                    myHP -= 10;
                }
                round2++;
            }
            if (myHP<0) {
                System.out.println(-1);
            } else {
                System.out.println(round);
            }
        }
    }
}

/*public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.next();
            char[] chars = str.toCharArray();
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i]=='(') stack.push(chars[i]);
                else if (chars[i]==')') stack.pop();
                else break;
            }
            System.out.println(stack.size());
        }
    }
}*/


//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            String str = in.next();
//            String result = "";
//            for (int i = 0; i < str.length(); i++) {
//                char word = str.charAt(i);
//                int count = 1;
//                int pass = 0;
//                if (Character.isLetter(word)) {
//                    for (int j = i + 1; j < str.length(); j++) {
//                        char current = str.charAt(j);
//                        if (Character.isLetter(current)) {
//                            if (str.charAt(j) == word) {
//                                count++;
//                                pass++;
//                            } else {
//                                break;
//                            }
//                        } else {
//                            pass++;
//                        }
//                    }
//                    i = i + pass;
//                    result += String.valueOf(word) + String.valueOf(count);
//                }
//            }
//            System.out.println(result);
//        }
//    }
//}

//    public static String countChar(String str) {
//        String result = "";
//        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
//        for (int i = 0; i < str.length(); i++) {
//            Character word = str.charAt(i);
//            if (Character.isLetter(word)) {
//                if (!hashMap.containsKey(word)) hashMap.put(word, 1);
//                else {
//                    int count = hashMap.get(word) + 1;
//                    hashMap.put(word, count);
//                }
//            }
//        }
//        Iterator iterator = hashMap.entrySet().iterator();
//        while (iterator.hasNext()) {
//            HashMap.Entry entry = (HashMap.Entry) iterator.next();
//            Object word = entry.getKey();
//            Object count = entry.getValue();
//            result = result + word.toString() + count.toString();
//        }
//        return result;
//    }

