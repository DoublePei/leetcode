package com.leetcode.net;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class Q_1 {

    /**
     * 暴力解法
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                if (nums[i] == nums[j]) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * hash
     */
    public static int[] hash(int[] nums, int target) {

        Map hash = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(target-nums[i])) {
                return new int[]{i,Integer.valueOf(hash.get(target-nums[i]).toString())};
            }
            hash.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum nums");
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6,6};
        int[] ints = Q_1.hash(nums, 12);
        System.out.println(ints[0] + "-" + ints[1]);
    }
}
