package com.easy.string;

/**
 * @link https://leetcode.com/problems/longest-common-prefix/description/
 */
public class longestPrefix {

//    Example 1:
//    Input: strs = ["flower","flow","flight"]
//    Output: "fl"
//    Example 2:
//
//    Input: strs = ["dog","racecar","car"]
//    Output: ""
//    Explanation: There is no common prefix among the input strings.

    public static String longestCommonPrefix(String[] strs) {
        String result = strs[0];

        for (int i = 1;i<strs.length;) {
            if (result.isEmpty()) {
                return "";
            }

            //  contains is wrong
//            if (strs[i].contains(result)) {
            if (strs[i].indexOf(result) == 0) {
                i++;
            }else {
                result = result.substring(0,result.length()-1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        String[] strs = new String[]{"flower","flow","flight"};
        String[] strs = new String[]{"c","cc"};

        System.out.println(longestCommonPrefix(strs));
    }
}
