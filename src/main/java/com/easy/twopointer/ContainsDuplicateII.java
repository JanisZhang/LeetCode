package com.easy.twopointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @link：https://leetcode.com/problems/contains-duplicate-ii/description/
 */
public class ContainsDuplicateII {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,1};
        int[] nums2 = new int[]{1,0,1,1};
        int[] nums3 = new int[]{1,2,3,1,2,3};

        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        System.out.println(containsDuplicateII.containsNearbyDuplicateSlidingWindow(nums1
                , 3));
        System.out.println(containsDuplicateII.containsNearbyDuplicateSlidingWindow(nums2
                , 1));
        System.out.println(containsDuplicateII.containsNearbyDuplicateSlidingWindow(nums3
                , 2));
    }

    private boolean containsNearbyDuplicateHashMap(int[] nums, int k) {
        // HashMap solution
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int keyValue = nums[i];
            if (map.containsKey(keyValue)) {
                if ((i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }


    public boolean containsNearbyDuplicateSlidingWindow(int[] nums, int k){
        // 窗口的大小固定为k，在固定窗口内看set是否重复！
        Set<Integer> set = new HashSet<>();

        int left = 0, right = 0;
        while(right < nums.length){
            if ((right - left) <= k){
                if(set.contains(nums[right])){
                    return true;
                }
                set.add(nums[right]);
                right++;
            }else {
                set.remove(nums[left]);
                left++;
            }
        }
        return false;
    }

}
