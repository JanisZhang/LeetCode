package com.easy.string.slidingwindow;

import java.util.ArrayList;
import java.util.List;

/**
 * @link：https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxL = 0, length;

        List<String> result = new ArrayList<>();

        while (right < s.length()) {
            String cur = String.valueOf(s.charAt(right));

            while(result.contains(cur)) {
                String del = String.valueOf(s.charAt(left));
                result.remove(del);
                left++;
            }

            if (!result.contains(cur)) {
                result.add(cur);
                length = right - left + 1;
                maxL = Math.max(maxL, length);
                right ++;
            }
        }
        return maxL;
    }

    public static void main(String[] args) {
        String  s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
