package com.problems.interview;

/**
 * @Author: koujiaxing
 * @Date: 2021/3/31 下午2:41
 *
 * 老虎证券面试
 * 翻转英文句子中的单词，保留句子中的所有空格，包括开头和结尾。
 * 例：
 *  输入 " I am a  student"
 *  输出 "student  a am I "
 */
public class TigerFirst {

    public static void main(String[] args) {
        String s = "this i   am a techcer    ";
        System.out.println(s);

        char[] charList = s.toCharArray();
        char space = " ".charAt(0);

        reverse(charList,0,charList.length-1);
        System.out.println(String.valueOf(charList));

        for(int i=0;i<charList.length;i++){
            if(charList[i] == space){
                continue;
            }
            int start = i;
            int end = i;
            for (int j = i + 1; j < charList.length; j++) {
                if ((charList[j] == space)) {
                    end = j - 1;
                    reverse(charList, start, end);
                    break;
                } else if (j == charList.length - 1) {
                    //处理结尾无空格的最后一个单词
                    end = j;
                    reverse(charList, start, end);
                    break;
                }
            }
            i = end;
        }

        System.out.println(String.valueOf(charList));
    }

    public static void reverse(char[] charList,int start,int end){
        if(charList.length<1||end-start<1){
            return;
        }

        for(int i = 0;i<=(end-start)/2;i++){
            char temp = charList[start+i];
            charList[start+i] = charList[end-i];
            charList[end-i] = temp;
        }
        return;
    }
}
