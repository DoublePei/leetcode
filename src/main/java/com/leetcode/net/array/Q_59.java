package com.leetcode.net.array;

/**
 *
 *给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 *
 * 示例:
 *
 * 输入: 3 输出: [ [ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ]
 *
 */
public class Q_59 {
    public int[][] generateMatrix(int n) {
        int left = 0, right = n - 1, top = 0, bot = n - 1;
        int index = 1;
        int[][] res = new int[n][n];

        while (index <= n * n) {

            for (int i = left; i <= right ; i++) {
                res[top][i] = index++;
            }
            top ++;

            for (int i = top; i <=bot ; i++) {
                res[i][right] = index++;
            }
            right --;

            for (int i = right; i >=left ; i--) {
                res[bot][i] = index++;
            }
            bot--;
            for (int i = bot; i >=top; i--) {
                res[i][left] = index++;
            }
            left++;
        }
        return res;
    }
}
