package com.string;

/**
 * @author JiaDi Zhang
 * @LeetCode: 28. Find the Index of the First Occurrence in a String
 * @Link:
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description
 * @date 2024/7/4
 */
public class FindTheIndexOf_String {
    public static int strStr(String haystack, String needle) {

        if(haystack.length() < needle.length()) {
            return -1;
        }

        if(haystack.equals(needle)) {
            return 0;
        }

        int result = 0;
        Boolean flag = false;

        for(int haystackIndex =0 ;haystackIndex < haystack.length();haystackIndex++) {
            int curIndex = haystackIndex;
            for(int needleIndex =0; needleIndex < needle.length(); ){
                if(curIndex == haystack.length()) {
                    return -1;
                }
                if(haystack.charAt(curIndex) == needle.charAt(needleIndex)) {
                    if(!flag){
                        result = curIndex;
                        flag = true;
                    }
                    curIndex++;
                    needleIndex++;

                    if(needleIndex == needle.length()){
                        return result;
                    }
                }else {
                    flag = false;
                    break;
                }
            }
        }

        return -1;
    }

    public static int strSubstring(String haystack, String needle) {
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int index = FindTheIndexOf_String.strStr("butsad","sad");
        System.out.println(index);
    }
}
