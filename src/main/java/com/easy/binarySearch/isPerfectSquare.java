package com.easy.binarySearch;

/**
 * @link:https://leetcode.com/problems/valid-perfect-square/description/
 */
public class isPerfectSquare {
    public static boolean isPerfectSquare(int x) {
        if(x == 0 || x == 1) {
            return true;
        }

        int left = 0, right = x - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;

            if(((double)x / mid) == mid) {
                return true;
            }else if ((double)x/mid < mid) {
                right = mid - 1;
            } else if ((double)x/mid > mid) {
                left = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println((double) 5/2);
        System.out.println(isPerfectSquare(0));
        System.out.println(isPerfectSquare(1));
        System.out.println(isPerfectSquare(5));
        System.out.println(isPerfectSquare(14));
        System.out.println(isPerfectSquare(16));
    }
}
