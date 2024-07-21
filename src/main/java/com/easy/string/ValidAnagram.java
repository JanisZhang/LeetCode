package com.easy.string;

/**
 * @author JiaDi Zhang
 * @LeetCode: 242. Valid Anagram
 * @Link:
 * https://leetcode.com/problems/valid-anagram/?envType=study-plan&id=data-structure-i
 * @date 2023/2/7
 */
public class ValidAnagram {
    /**
     * The idea is simple.
     * <p>It creates a size 26 int arrays as buckets for each letter in alphabet.
     * <p>It increments the bucket value with String s and decrement with string t.
     * <p>So if they are anagrams, all buckets should remain with initial value which is zero.
     * <p>So just checking that and return
     */
    public static boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}
