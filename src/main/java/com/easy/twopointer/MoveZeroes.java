package com.easy.twopointer;

/**
 * @author JiaDi Zhang
 * @LeetCode: 283. Move Zeroes
 * @Link:
 * https://leetcode.com/problems/move-zeroes/description/
 * @date 2024/07/24
 */
public class MoveZeroes {
//    Example 1:
//    Input: nums = [0,1,0,3,12]
//    Output: [1,3,12,0,0]

//    Example 2:
//    Input: nums = [0]
//    Output: [0]
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while(fast < nums.length) {
            if(nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        while(slow < nums.length) {
            nums[slow] = 0;
            slow++;
        }
    }

//    public static void main(String[] args) {
////        int[] nums = {0, 1, 0, 3, 12};
//        int[] nums = {0};
//        for(int i:MoveZeroes.moveZeroes(nums)){
//            System.out.println(i);
//        }
//    }
}
