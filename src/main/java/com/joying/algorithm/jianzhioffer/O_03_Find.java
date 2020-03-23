package com.joying.algorithm.jianzhioffer;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */
public class O_03_Find {
    /**
     * 分别遍历查找
     *
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 通过每一行的arrar[i]的值来判断是否大于还是小于，再分别查找
     *
     * @param target
     * @param array
     * @return
     */
    public boolean Find1(int target, int[][] array) {
        int i = 0;
        int row_count = array.length;
        int column_counts = array[0].length - 1;
        while ((i < row_count) && (column_counts >= 0)) {
            int value = array[i][column_counts];
            if (target == value) return true;
            else if (value > target) column_counts -= 1;
            else i += 1;
        }
        return false;
    }
}
