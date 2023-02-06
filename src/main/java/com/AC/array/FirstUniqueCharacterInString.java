package com.AC.array;

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
    /**
     * Intuition: use existed index method
     * Time complexity: O(n)
     * very low efficiency
     */
    public static int firstUniqChar1(String s) {
        String[] str = s.split("");
        for(int i = 0; i < str.length; i++) {
            if (s.lastIndexOf(str[i]) == s.indexOf(str[i])) {
                return i;
            }
        }
        return -1;
    }
}
