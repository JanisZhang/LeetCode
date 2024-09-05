package com.easy.string.twopointer;

/**
 * @link https://leetcode.com/problems/is-subsequence/description/
 */
public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        if (t.isEmpty()) {
            return false;
        }

        int p1 = 0, p2 = 0;
        int res = 0;
        while (p2 < t.length()) {
            if (s.charAt(p1) == t.charAt(p2)) {
                res++;
                p1++;
            }

            if(res == s.length()) {
                return true;
            }
            p2++;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "", t = "ahbgdc";

        System.out.println(isSubsequence(s,t));

    }
}
