package com.leetcode.net.array;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 */
public class Q_704 {
    public static void main(String[] args) {

    }

    /**
     * 二分查找 因为是有序的。
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length - 1])
            return -1;
        int left = 0, right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            int num = (left + right) / 2;
            if (nums[num] == target) {
                return num;
            }
            if (nums[num] > target) {
                right = num - 1;
            }
            if (nums[num] < target) {
                left = num + 1;
            }
        }
        return -1;
    }
}
