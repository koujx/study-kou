package com.problems.jianZhiOffer;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by 902 on 2016/3/22.
 * 扫描透镜
 * 在N*M的草地上,提莫种了K个蘑菇,蘑菇爆炸的威力极大,兰博不想贸然去闯,而且蘑菇是隐形的.
 * 只有一种叫做扫描透镜的物品可以扫描出隐形的蘑菇,于是他回了一趟战争学院,买了2个扫描透镜,
 * 一个扫描透镜可以扫描出(3*3)方格中所有的蘑菇,然后兰博就可以清理掉一些隐形的蘑菇. 问:兰博最多可以清理多少个蘑菇?
 * <p/>
 * 输入描述:
 * 第一行三个整数:N,M,K,(1≤N,M≤20,K≤100),N,M代表了草地的大小;
 * 接下来K行,每行两个整数x,y(1≤x≤N,1≤y≤M).代表(x,y)处提莫种了一个蘑菇.
 * 一个方格可以种无穷个蘑菇.
 * <p/>
 * 输出描述:
 * 输出一行,在这一行输出一个整数,代表兰博最多可以清理多少个蘑菇.
 */
public class Mushroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            int m = input.nextInt();
            int nums = input.nextInt();
            HashMap<Object, Integer> mushrooms = new HashMap<Object, Integer>();
            for (int i = 0; i < nums; i++) {
//                int c1= input.nextInt()-1;
//                int c2 =input.nextInt()-1;
                String mushroom = input.nextInt()+"+"+input.nextInt();
                if (mushrooms.containsKey(mushroom)) {
                    mushrooms.put(mushroom, 2);
                } else mushrooms.put(mushroom, 1);
            }
            Mushroom.solution(n, m, mushrooms);
        }
    }

    public static void solution(int n, int m, HashMap<Object, Integer> mushrooms) {
        if (mushrooms.size() < 3) System.out.println(0);
        else {
            int m1 = 0;
            int m2 = 0;
            int total = m1 + m2;
            for (int i1 = 1; i1 < n - 1; i1++) {
                for (int j1 = 1; j1 < m - 1; j1++) {
                    int[] coor1 = {i1, j1};
                    HashMap<Object, Integer> newM1 = new HashMap<Object, Integer>(mushrooms);
                    m1 = count(coor1, newM1);
                    total = m1 + m2;
                    if (total != 0) {
                        for (int i2 = i1; i2 < n - 1; i2++) {
                            for (int j2 = j1; j2 < m - 1; j2++) {
                                int[] coor2 = {i2, j2};
                                HashMap<Object, Integer> newM2 = new HashMap<Object, Integer>(newM1);
                                m2 = count(coor2, newM2);
                                int current = m1 + m2;
                                if (total < current) {
                                    i1 = i2;
                                    j1 = j2;
                                    total = current;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(total);
        }
    }

    public static int count(int[] coor, HashMap<Object, Integer> mushrooms) {
        int counts = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[] coors = {coor[0] + i, coor[1] + j};
                if (mushrooms.containsKey(toS(coors))) {
                    counts++;
                    if (mushrooms.get(toS(coors)) == 1) mushrooms.remove(toS(coors));
                }
            }
        }
        return counts;
    }
    public static String toS(int[] n){
        return n[0]+"+"+n[1];
    }

   /* private static int countMushrooms(int[] coor1, int[] coor2, HashMap<Object, Integer> mushrooms) {
        int m1 = 0;
        int m2 = 0;
        if ((coor2[0] - coor1[0] > 2) && (coor2[1] - coor1[1] > 2)) {
            m1 = count(coor1, mushrooms);
            m2 = count(coor2, mushrooms);
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int[] coors = {coor1[0] + j, coor1[1] + i};
                    if (mushrooms.containsKey(coors)) {
                        m1++;
                        if (mushrooms.get(coors) == 1) mushrooms.remove(coors);
                    }
                }
            }
            m2 = count(coor2, mushrooms);
        }
        return m1 + m2;
    }*/

}
