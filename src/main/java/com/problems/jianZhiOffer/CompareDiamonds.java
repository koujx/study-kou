package com.problems.jianZhiOffer;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by koujx on 2016/4/14.
 * {编程题} 比较重量
 * 小明陪小红去看钻石，他们从一堆钻石中随机抽取两颗并比较她们的重量。这些钻石的重量各不相同。在他们们比较了一段时间后，它们看中了两颗钻石g1和g2。现在请你根据之前比较的信息判断这两颗钻石的哪颗更重。
 * 给定两颗钻石的编号g1,g2，编号从1开始，同时给定关系数组vector,其中元素为一些二元组，第一个元素为一次比较中较重的钻石的编号，第二个元素为较轻的钻石的编号。最后给定之前的比较次数n。请返回这两颗钻石的关系，若g1更重返回1，g2更重返回-1，无法判断返回0。输入数据保证合法，不会有矛盾情况出现。
 * 测试样例：
 * 2,3,{{1,2},{2,4},{1,3},{4,3}},4
 * 返回: 1
 */
public class CompareDiamonds {

    public static void main(String[] args) {
        //int[][] records = {{1, 2}, {2, 4}, {1, 3}, {4, 3}, {3, 3}};
        int[][] records = {{5, 5}, {2, 4}, {8, 6}, {12, 10}, {12, 12}, {6, 12}, {2, 3}, {8, 5}, {7, 5}, {5, 5}, {3, 10}, {11, 11}, {12, 12}, {10, 11}, {7, 3}, {2, 3}, {11, 5}, {1, 9}, {8, 12}, {3, 10}, {8, 4}, {7, 1}, {9, 5}, {6, 4}, {1, 11}, {7, 9}, {12, 12}, {4, 11}, {8, 6}, {2, 3}, {12, 5}, {2, 7}, {4, 11}, {4, 11}, {3, 3}, {4, 11}, {3, 4}, {8, 1}, {10, 9}, {4, 5}, {6, 9}, {8, 10}, {7, 11}, {12, 5}, {2, 12}, {1, 9}, {7, 3}, {8, 10}, {2, 1}, {8, 4}, {3, 11}, {6, 4}, {2, 4}, {7, 1}, {6, 6}, {8, 1}, {1, 4}, {3, 5}, {12, 10}, {1, 5}, {2, 4}, {6, 3}, {7, 12}, {6, 10}, {6, 11}, {7, 12}, {7, 4}, {9, 5}, {2, 11}, {2, 6}, {6, 5}, {8, 5}, {1, 9}, {6, 4}, {7, 1}, {1, 1}, {2, 9}, {8, 4}, {6, 5}, {1, 10}, {6, 3}, {8, 7}, {8, 2}, {6, 5}, {2, 12}, {4, 9}, {7, 11}, {4, 9}, {2, 10}, {8, 10}, {12, 10}, {6, 3}, {2, 10}, {12, 9}, {8, 4}, {2, 12}, {7, 11}, {9, 5}, {3, 5}, {2, 5}, {7, 9}, {8, 10}, {7, 9}, {4, 4}, {2, 3}, {2, 2}, {7, 3}, {6, 5}, {2, 4}, {4, 9}, {8, 10}, {12, 9}, {2, 9}, {8, 9}, {12, 5}, {8, 2}, {3, 12}, {1, 12}, {1, 12}, {8, 2}, {2, 5}, {1, 10}, {12, 5}, {3, 4}, {8, 11}, {2, 12}, {8, 2}, {10, 11}, {8, 3}, {2, 7}, {8, 6}, {1, 10}, {7, 12}, {8, 6}, {1, 1}, {3, 4}};
        System.out.println(new CompareDiamonds().cmp(12, 2, records, 136));
    }

    public int cmp(int g1, int g2, int[][] records, int n) {
        // write code here
        if (cmpD(g1, g2, records, n)) return 1;
        else if (cmpD(g2, g1, records, n)) return -1;
        else return 0;
    }

    public boolean cmpD(int g1, int g2, int[][] records, int n){
        HashSet<Integer> toVisit=new HashSet<Integer>();
        HashSet<Integer> visited=new HashSet<Integer>();
        toVisit.add(g1);
        while(!toVisit.isEmpty()){
            Iterator<Integer> iterator=toVisit.iterator();
            int temp= iterator.next();
            toVisit.remove(temp);

            if(visited.contains(temp))
                continue;
            else{
                visited.add(temp);
                for(int i = 0; i < n; i++){
                    if(records[i][0] == temp){
                        if(records[i][1] == g2)
                            return true;
                        else if(!visited.contains(records[i][1]) && !toVisit.contains(records[i][1])){
                            toVisit.add(records[i][1]);
                        }
                    }
                }
            }
        }
        return false;

    }


//    public boolean cmpD(int g1, int g2, int[][] records, int n) {
//        for (int i = 0; i < n; i++) {
//            int[] record = records[i];
//            if (used.contains(i) || record[0] == record[1]) {
//                continue;
//            }
//            if (record[0] == g1 && record[1] != g2) {
//                used.add(i);
//                if (cmpD(record[1], g2, records, n)) return true;
//                else if (record[0] == g1 && record[1] == g2) return true;
//            }
//        }
//        return false;
//    }
}
