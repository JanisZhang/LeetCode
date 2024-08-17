package com.easy.array.binarySearch;

public class FindFirstPosition {
    private static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left)/2;

            if (target == nums[mid]) {
                right = mid - 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            }
        }

        return nums[left] == target? left:-1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,7,8,9,9,10};
        System.out.println(search(nums,11));
    }
}
