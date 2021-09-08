package com.leetcode.net.array;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回 0。
 * <p>
 * 示例：
 * <p>
 * 输入：s = 11, nums = [1,2,3,4,5] 输出：2 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 */
public class Q_209 {


    public static void main(String[] args) {
        Q_209 q = new Q_209();
        int num[] = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        q.minSubArrayLen(11, num);


    }

    // 滑动窗口
    public int minSubArrayLen(int s, int[] nums) {

        int fastIndex = 0;
        int slowIndex = 0;
        int sum = 0;
        int size = 0;
        for (;;) {
            //当fast 大于长度的时候，可以结束了
            if (fastIndex > nums.length - 1) {
                break;
            }
            if (nums[fastIndex] >= s || nums[slowIndex] >= s) {
                size = 1;
            }
            sum = sum + nums[fastIndex];
            if (sum >= s) {
                if (size == 0 || (fastIndex - slowIndex + 1) < size) {
                    size = fastIndex - slowIndex + 1;
                }
                sum = sum - nums[slowIndex] - nums[fastIndex];
                slowIndex++;
            } else {
                fastIndex++;
            }

        }
        return size;
    }
}
