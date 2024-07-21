package com.array;

/**
 * @author JiaDi Zhang
 * @LeetCode: 26. Remove Duplicates from Sorted Array
 * @Link:
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * @date 2024/07/17
 */
public class RemoveDuplicatesFromSortedArray {
    //Input: nums = [1,1,2]
    //Output: 2, nums = [1,2,_]
    //Input: nums = [0,0,1,1,1,2,2,3,3,4]
    //Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    public static int removeDuplicates(int[] nums) {
        int slowPointer = 0;
        for(int fastPointer = 1; fastPointer < nums.length; fastPointer++) {
            if(nums[fastPointer]!=nums[slowPointer]) {
                nums[++slowPointer] = nums[fastPointer];
            }
        }
        return ++slowPointer;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(nums));
    }

}
