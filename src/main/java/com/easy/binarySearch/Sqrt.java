package com.easy.binarySearch;

import static java.lang.Math.floor;
import static java.lang.Math.round;

/**
 * @link: https://leetcode.com/problems/sqrtx/description/
 */
public class Sqrt {
    /**
     * Given a non-negative integer x,
     * return the square root of x rounded down to the nearest integer.
     * The returned integer should be non-negative as well.
     */
    public static int mySqrt(int x) {

        if(x == 0 || x == 1) {
            return x;
        }

        int left = 0, right = x;

        while(left < right) {
            int mid = left + (right - left)/2;

            if (x / mid == mid) {
                return  mid;
            }else if (((x / mid) < mid)) {
                right = mid;
            }else if ((x / mid) > mid) {
                left = mid + 1;
            }
        }

        return left - 1;
    }

    public static void main(String[] args) {
//        System.out.println( (int)(2.8*10) / 10);
        System.out.println(mySqrt(2147395599));
    }
}
