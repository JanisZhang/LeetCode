package com.array;

import java.util.HashSet;

/**
 * @author JiaDi Zhang
 * @LeetCode: 217. Contains Duplicate
 * @Link:
 * @date 2023/2/3
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
