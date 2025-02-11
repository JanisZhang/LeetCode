package com.easy.hashset;

import java.util.HashSet;

/**
 * @link: https://leetcode.com/problems/happy-number/description/
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        if (n==1){
            return true;
        }
        if (integers.contains(n)) {  // Cycle detected
            return false;
        }

        integers.add(n);

        int sum = 0;

        while (n>0){
            sum += (n%10) * (n%10);
            n = n/10;
        }
        return isHappy(sum);
    }

    HashSet<Integer> integers = new HashSet<>();
}
