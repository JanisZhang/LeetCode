package com.easy.array.twoPointer;

/**
 * @link https://leetcode.com/problems/minimum-size-subarray-sum/description/
 */
public class MinimumSizeSubarraySum {

//    Example 1:
//    Input: target = 7, nums = [2,3,1,2,4,3]
//    Output: 2
//    Explanation: The subarray [4,3] has the minimal length under the problem constraint.
//
//    Example 2:
//    Input: target = 4, nums = [1,4,4]
//    Output: 1
//
//    Example 3:
//    Input: target = 11, nums = [1,1,1,1,1,1,1,1]
//    Output: 0

    // 思路：题目要求sub array，可以应用sliding window algo
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int miniLength = 0;
        int sum = 0;

        while (right < nums.length) {
            if (sum < target) {
                right++;

                if (right < nums.length) {
                    sum += nums[right];
                }
            } else {
                if (miniLength == 0) {
                    miniLength = right - left;
                }else {
                    miniLength = Math.min(miniLength, right - left);
                }
                sum -= nums[left];
                left++;
            }
        }
        return miniLength;
    }

    public static void main(String[] args) {
        int target = 11;
//        int[] nums = new int[]{2,3,1,2,4,3};
        int[] nums = new int[]{1,4,4};
//        int[] nums = new int[]{1,1,1,1,1,1,1,1};

        System.out.println(minSubArrayLen(target,nums));

    }


}
