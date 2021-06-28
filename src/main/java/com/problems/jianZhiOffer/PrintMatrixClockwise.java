package com.problems.jianZhiOffer;

import java.util.ArrayList;

/**
 * Created by koujx on 2016/5/10.
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵：
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class PrintMatrixClockwise {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> clockwise = new ArrayList<Integer>();
        int n = matrix.length - 1;
        int m = matrix[0].length - 1;
        int n1 = 0;
        int m1 = 0;
        while (n1 <= n && m1 <= m) {
            for (int i = m1; i <= m; i++) {
                clockwise.add(matrix[n1][i]);
            }
            for (int i = n1 + 1; i <= n; i++) {
                clockwise.add(matrix[i][m]);
            }
            if (n1 < n) {
                for (int i = m - 1; i >= m1; i--) {
                    clockwise.add(matrix[n][i]);
                }
            }
            if (m1 < m) {
                for (int i = n - 1; i > n1; i--) {
                    clockwise.add(matrix[i][m1]);
                }
            }
            n--;
            m--;
            n1++;
            m1++;
        }
        return clockwise;
    }
}