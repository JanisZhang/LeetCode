package com.easy.binarySearch;

import java.util.HashMap;

/**
 * @link：https://leetcode.com/problems/contains-duplicate-ii/description/
 */
public class ContainsDuplicateII {
    HashMap<Integer,Integer> map = new HashMap<>();

    /**
     * 只用map不行，上面这种情况最大相差2，最小相差1.还是得用滑动窗口存相同的数字 中间的最小距离。 -- （貌似用单列表就可以？）
     * 但是怎么写呢？
     *    -- 先写个大概的框架再增加细节吧。
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;

        for (;i< nums.length;i++){
            if (map.get(nums[i]) == null){
                map.put(nums[i],i);
            }else {
                return i - map.get(nums[i]) <= k;

            }
        }

        return false;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k){
        先写个伪代码

        int left = 0, right = 0;

        windows
        while (left < nums.length) {
            windows.add(nums)
        }

    }

    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3,1};
//        int[] nums = new int[]{1,2,3,1,2,3};
        int[] nums = new int[]{1,0,1,1};


        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        System.out.println(containsDuplicateII.containsNearbyDuplicate2(nums,
                1));
    }
}
