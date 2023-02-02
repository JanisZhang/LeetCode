package com.easy.array;

import java.util.HashSet;

public class ContainsDuplicate217 {
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
