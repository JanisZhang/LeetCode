package com.easy.twopointer;

/**
 * @author JiaDi Zhang
 * @LeetCode: 27. Remove Element
 * @Link: https://leetcode.com/problems/remove-element/description/
 * @date 2024/07/23
 */
public class RemoveElement {
    //Input: nums = [3,2,2,3], val = 3
    //Output: 2, nums = [2,2,_,_]
    //Input: nums = [0,1,2,2,3,0,4,2], val = 2
    //Output: 5, nums = [0,1,4,0,3,_,_,_]
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int slow = 0;
        int fast = 0;

        while(fast < nums.length){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(RemoveElement.removeElement2(nums, 2));
    }

    //认真读题后，我的想法，只要nums[i] != val, nums[k++] = nums[i]
    public int removeElement2(int[] nums, int val) {
        int k = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=val){
                nums[k++] =  nums[i];
            }
        }

        return k;
    }
}
