package com.notAC.array;

/**
 * @author JiaDi Zhang
 * @LeetCode: 53. Maximum Subarray
 * @Link:
 * @date 2023/2/3
 */
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int length = nums.length;

        if(length == 1) {
            return nums[0];
        }

        int sum = 0, max = Integer.MIN_VALUE;

        for (int index = 0; index< length; index++) {
            sum += nums[index];

            max =Math.max(sum,max);

            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
