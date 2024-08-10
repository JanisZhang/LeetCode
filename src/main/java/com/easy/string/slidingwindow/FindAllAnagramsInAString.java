package com.easy.string.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @link： https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
 */
public class FindAllAnagramsInAString {

//    Example 1:
//    Input: s = "cbaebabacd", p = "abc"
//    Output: [0,6]
//
//    Example 2:
//    Input: s = "abab", p = "ab"
//    Output: [0,1,2]
    public static List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> window = new HashMap<>();
        HashMap<Character,Integer> need = new HashMap<>();

        for (char i:p.toCharArray()) {
            need.put(i, need.getOrDefault(i,0)+1);
        }

        int left = 0, right = 0;
        int valid = 0;
        List<Integer> list = new ArrayList<>();

        while (right < s.length()) {
            char cur = s.charAt(right);
            right++;

            if(need.containsKey(cur)) {
                window.put(cur,window.getOrDefault(cur,0)+1);

                if (need.get(cur).equals(window.get(cur))) {
                    valid ++;
                }
            }

            while (right - left >= p.length()) {
                if (valid == need.size()) {
                    list.add(left);
                }

                char del = s.charAt(left);
                left++;

                if (need.containsKey(del)) {
                    if (need.get(del).equals(window.get(del))) {
                        valid--;
                    }
                    window.put(del, window.get(del)-1);
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String  s = "abab", p = "ab";
        List<Integer> nums = findAnagrams(s,p);
        for (int num:nums) {
            System.out.println(num);
        }
    }
}
