package com.easy.string.slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @link: https://leetcode.com/problems/minimum-window-substring/description/
 */
public class MinimumWindowSubstring {
//    Example 1:
//    Input: s = "ADOBECODEBANC", t = "ABC"
//    Output: "BANC"
//    Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
//
//    Example 2:
//    Input: s = "a", t = "a"
//    Output: "a"
//    Explanation: The entire string s is the minimum window.
//
//    Example 3:
//    Input: s = "a", t = "aa"
//    Output: ""
//    Explanation: Both 'a's from t must be included in the window.
//    Since the largest window of s only has one 'a', return empty string.
    public static String minWindow2(String s, String t) {
        if(s.length() <= t.length()){
            if(s.equals(t)){
                return s;
            }
            return "";
        }

        int left = 0, right = 0;
        StringBuilder sb = new StringBuilder();
        String[] ts = new String[]{Arrays.toString(t.toCharArray())};

        while (right < s.length()) {
            String cur = s.substring(left, right);
            for (String i:ts) {
                if (!cur.contains(i)) {
                    right++;
                    break;
                }
            }


            sb.append(cur);
        }

        return null;
    }

    public static String minWindow(String s, String t) {
        HashMap<Character,Integer> window = new HashMap<>();
        HashMap<Character,Integer> need = new HashMap<>();

        for (char c: t.toCharArray()) {
            need.put(c, need.getOrDefault(c,0)+1);
        }

        int left = 0, right = 0;
        // valid变量表示窗口中满足need条件字符的个数。
        int valid = 0;
        int start = 0, len = Integer.MAX_VALUE;
        // 记录最小覆盖子串的起始索引及长度
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            // 进行窗口内一系列数据的更新
            if (need.containsKey(c)) {
                window.put(c,window.getOrDefault(c,0)+1);
                if(window.get(c).equals(need.get(c))){
                    valid++;
                }
            }
            // 判断左侧窗口是否需要收缩
            while (valid == need.size()){
                // 更新最小覆盖子串
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                // 左侧移出窗口的字符
                char d = s.charAt(left);
                left++;
                if (need.containsKey(d)) {
                   if (window.get(d).equals(need.get(d))) {
                       valid--;
                   }
                    window.put(d,window.get(d)-1);
                }

            }
        }
        return len == Integer.MAX_VALUE? "":s.substring(start,start+len);
    }

    public static void main(String[] args) {
        String  s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s,t));
    }

}
