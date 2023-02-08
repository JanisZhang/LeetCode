package com.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JiaDi Zhang
 * @LeetCode: 387. First Unique Character in a String
 * @Link:
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * @date 2023/2/6
 */
public class FirstUniqueCharacterInString {

    public static void main(String[] args) {
        String s = "leetcode";
        firstUniqChar2(s);
    }

    /**
     * Intuition: use existed index method
     * Time complexity: O(n)
     * very low efficiency
     */
    public static int firstUniqChar(String s) {
        String[] str = s.split("");
        for(int i = 0; i < str.length; i++) {
            if (s.lastIndexOf(str[i]) == s.indexOf(str[i])) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar1(String s) {
        for(char c : s.toCharArray()){
            int index = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);
            if(index == lastIndex)
                return index;
        }
        return -1;
    }


    public static int firstUniqChar2(String s) {
        // Base case...
        if(s.length() == 0)  return -1;
        // To keep track of the count of each character, we initialize an int[]store with size 26...
        int[] store = new int[26];
        // Traverse string to keep track number of times each character in the string appears...
        for(char ch : s.toCharArray()){
            store[ch - 'a']++;      // To access the store[] element representative of each character, we subtract ‘a’ from that character...
        }
        // Traverse string again to find a character that appears exactly one time, return it’s index...
        for(int idx = 0; idx < s.length(); idx++){
            if(store[s.charAt(idx) - 'a'] == 1){
                return idx;
            }
        }
        return -1;      // if no character appeared exactly once...
    }
}
