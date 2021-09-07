package com.leetcode.net.array;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * <p>
 * 示例 1： 输入：nums = [-4,-1,0,3,10] 输出：[0,1,9,16,100] 解释：平方后，数组变为 [16,1,0,9,100]，排序后，数组变为 [0,1,9,16,100]
 * <p>
 * 示例 2： 输入：nums = [-7,-3,2,3,11] 输出：[4,9,9,49,121]
 * <p>
 * #
 */
public class Q_977 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int right = 0;
        int left = nums.length - 1, index = nums.length - 1;
        while (right < left) {
            if (nums[right] * nums[right] > nums[left] * nums[left]) {
                result[index--] = nums[right] * nums[right];
                right++;
            } else {
                result[index--] = nums[left] * nums[left];
                left--;
            }
        }
        result[0] = nums[right > left ? left : right] * nums[right > left ? left : right];
        return result;
    }
}
