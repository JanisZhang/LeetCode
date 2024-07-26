package com.easy.twoPointer;

/**
 * @link: https://leetcode.com/problems/reverse-string/description/
 */
public class ReverseString {
//    Example 1:
//    Input: s = ["h","e","l","l","o"]
//    Output: ["o","l","l","e","h"]
//
//    Example 2:
//    Input: s = ["H","a","n","n","a","h"]
//    Output: ["h","a","n","n","a","H"]
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
//        char[] c = {'h', 'e', 'l', 'l', 'o'};
        char[] c = {'H', 'a', 'n', 'n', 'a', 'h'};
        ReverseString.reverseString(c);
        System.out.println(c);
    }
}
