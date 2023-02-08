package com.string;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author JiaDi Zhang
 * @LeetCode: 383. Ransom Note
 * @Link:
 * https://leetcode.com/problems/ransom-note/
 * @date 2023/2/6
 */
public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aab", magazine = "baa";
        System.out.println(canConstruct(ransomNote,magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] arr = new int[26];

        for (char m : magazine.toCharArray()) {
            arr[m - 'a']++;
        }

        for (char r : ransomNote.toCharArray()) {
            if(arr[r - 'a'] == 0){
                return false;
            }
            arr[r - 'a']--;
        }

        return true;
    }


    public static boolean canConstruct1(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        if (!magazine.contains(ransomNote)) {
            Map<String,Integer> map = new HashMap<String, Integer>();
            for (String s:magazine.split("")) {
                if (map.get(s) == null) {
                    map.put(s,1);
                }else {
                    map.put(s,map.get(s) + 1);
                }
            }
            for (String str:ransomNote.split("")) {
                if (!map.containsKey(str)){
                    return false;
                }else  {
                    int count = map.get(str) - 1;
                    if (count < 0) {
                        return false;
                    }
                    map.put(str,count);
                }
            }
        }
        return true;
    }
    public static boolean canConstruct2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        if (!magazine.contains(ransomNote)) {
            Map<String,Integer> map1 = new HashMap<String, Integer>();
            Map<String,Integer> map2 = new HashMap<String, Integer>();
            String[] ransomStrs = ransomNote.split("");
            for (String s:ransomStrs) {
                if (map1.get(s) == null) {
                    map1.put(s,1);
                }else {
                    map1.put(s,map1.get(s) + 1);
                }
            }
            for (String s:magazine.split("")) {
                if (map2.get(s) == null) {
                    map2.put(s,1);
                }else {
                    map2.put(s,map2.get(s) + 1);
                }
            }
            for (int i = 0; i< ransomNote.length(); i++) {
                if (!map2.containsKey(ransomStrs[i])) {
                    return false;
                }
                if (map1.get(ransomStrs[i]) != map2.get(ransomStrs[i])) {
                    return false;
                }

            }
        }
        return true;
    }



}
