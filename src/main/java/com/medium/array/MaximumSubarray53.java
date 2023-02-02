package com.medium.array;

public class MaximumSubarray53 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        nums[0] = -5;
        nums[1] = -4;
        nums[2] = -1;
        nums[3] = -7;
        nums[4] = -8;
        System.out.println(maxSubArray(nums));
    }

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
