package com.easy.array.binarySearch;

/**
 * @link:https://leetcode.com/problems/binary-search/description/
 */
public class BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (target < nums[mid]) {
                right = mid - 1;
            }else if(target > nums[mid]) {
                left = mid + 1;
            }else if (target == nums[mid]) {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        Example 1:
//        Input: nums = [-1,0,3,5,9,12], target = 9
//        Output: 4
//        Explanation: 9 exists in nums and its index is 4
//
//        Example 2:
//        Input: nums = [-1,0,3,5,9,12], target = 2
//        Output: -1
//        Explanation: 2 does not exist in nums so return -1
        int[] nums = new int[]{-1,0,3,5,9,12};
        System.out.println(search(nums,9));
    }
}
