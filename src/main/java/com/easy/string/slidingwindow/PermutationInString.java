package com.easy.string.slidingwindow;

import java.util.HashMap;

/**
 * @link: https://leetcode.com/problems/permutation-in-string/description/
 */
public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> windows = new HashMap<>();
        HashMap<Character,Integer> need = new HashMap<>();

        for (char cur:s1.toCharArray()) {
            need.put(cur,need.getOrDefault(cur,0)+1);
        }

        int left = 0, right =0;
        int valid = 0;

        while (right < s2.length()) {
            char cur = s2.charAt(right);
            right++;

            if (need.containsKey(cur)) {
                windows.put(cur, windows.getOrDefault(cur,0)+1);
                if(windows.get(cur).equals(need.get(cur))){
                    valid++;
                }
            }

            while (right - left >= s1.length()) {
                if (valid == need.size()) {
                    return true;
                }

                char del = s2.charAt(left);
                left++;

                if(need.containsKey(del)){
                    if(windows.get(del).equals(need.get(del))){
                        valid--;
                    }
                    windows.put(del, windows.get(del)-1);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "adc", s2 = "dcda";
        System.out.println(checkInclusion(s1,s2));
    }
}
