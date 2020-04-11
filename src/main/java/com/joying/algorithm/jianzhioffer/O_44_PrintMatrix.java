package com.joying.algorithm.jianzhioffer;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，
 * 如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
 */
public class O_44_PrintMatrix {
    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if (matrix == null) return result;

        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int down = matrix.length - 1;
        while (left <= right && up <= down) {
            //向右
            for (int i = left; i <= right; i++) {
                result.add(matrix[up][i]);
            }
            //向下
            for (int i = up + 1; i <= down; i++)
                result.add(matrix[i][right]);
            //向左  添加条件是为了判断只有一行的情况，避免重复写入
            if (up < down) {
                for (int i = right - 1; i >= left; i--) {
                    result.add(matrix[down][i]);
                }
            }
            //向上 添加条件是为了判断只有一列的情况，避免重复写入
            if (left < right) {
                for (int i = down - 1; i >= up + 1; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            up++;
            down--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] matrix = new int[][]{{1,2,3,4}};
        System.out.println("printMatrix(matrix) = " + printMatrix(matrix));
    }
}
