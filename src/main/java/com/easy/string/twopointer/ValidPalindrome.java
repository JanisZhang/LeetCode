package com.easy.string.twopointer;

/**
 * @link： https://leetcode.com/problems/valid-palindrome/description/
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        if(s.isBlank() || s.isEmpty()) {
            return true;
        }

        s = s.replaceAll("[^0-9a-zA-Z]","").toLowerCase();

        int left = 0, right = s.length()-1;

        while (left < right){
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("P"));
    }
}
