package com.easy.twopointer;

/**
 * @link https://leetcode.com/problems/squares-of-a-sorted-array/description/
 */
public class SquaresOfaSortedArray {
    // squaring and sorting


    public static int[] sortedSquares(int[] nums) {
        int p1 = 0, p2 = nums.length - 1;
        int k = nums.length-1;
        int[] result = new int[k+1];

        while(p1 <= p2) {
            int leftVal = nums[p1]*nums[p1];
            int rightVal = nums[p2]*nums[p2];

            if (leftVal < rightVal) {
                result[k] = rightVal;
                p2--;
            }else {
                result[k] = leftVal;
                p1++;
            }
            k--;
        }

        return result;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-7,-3,2,3,11};
        // nums = [-4,-1,0,3,10]
        // nums = [-7,-3,2,3,11]

        System.out.println(sortedSquares(nums)[0]);
        System.out.println(sortedSquares(nums)[1]);
        System.out.println(sortedSquares(nums)[2]);
        System.out.println(sortedSquares(nums)[3]);
        System.out.println(sortedSquares(nums)[4]);

    }
}
