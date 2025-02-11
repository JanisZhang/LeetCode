package com.easy.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * @link: https://leetcode.com/problems/happy-number/description/
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        return squaresResult(n, seen);
    }

    private static boolean squaresResult(int n, Set<Integer> seen) {
        if (n == 1) {
            return true;
        }

        if (seen.contains(n)) {  // Cycle detected
            return false;
        }

        seen.add(n);  // Mark number as seen

        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);  // Sum of squares of digits
            n /= 10;
        }

        return squaresResult(sum, seen);
    }
}
