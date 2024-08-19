package com.easy.array.binarySearch;


/**
 * @link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 */
public class FindFirstAndLastPosition {
    private static int left_bound(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left)/2;

            if (target == nums[mid]) {
                right = mid;
            } else if (target < nums[mid]) {
                right = mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            }
        }
        return nums[left] == target? left:-1;
    }

    private static int right_bound(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left)/2;

            if (target == nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            }
        }

        return nums[left-1] == target? left-1:-1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1};
//        System.out.println(left_bound(nums,8));
        System.out.println(searchRange(nums,1)[0]);
        System.out.println(searchRange(nums,1)[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] set = new int[2];

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 别返回，锁定左侧边界
                right = mid - 1;
            }
        }
        // 判断 target 是否存在于 nums 中
        if (left < 0 || left >= nums.length) {
            set[0] = -1;
        }else {
            // 判断一下 nums[left] 是不是 target
            set[0] = nums[left] == target ? left : -1;
        }

        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 别返回，锁定右侧边界
                left = mid + 1;
            }
        }

        // 由于 while 的结束条件是 right == left - 1，且现在在求右边界
        // 所以用 right 替代 left - 1 更好记
        if (right < 0 || right >= nums.length) {
            set[1] = -1;
        }else {
            set[1] = nums[right] == target ? right : -1;
        }

        return set;
    }
}
