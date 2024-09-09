package com.easy.string;

/**
 * @link https://leetcode.com/problems/isomorphic-strings/description/
 */
public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {

        // If the messages are different lengths, they can't be the same
        // secret message.
        if (s.length() != t.length()) {
            return false;
        }

        int[] mapS = new int[200];
        int[] mapT = new int[200];

        for (int i = 0; i < s.length(); i++) {

            if (mapS[s.charAt(i)] != mapT[t.charAt(i)]) {
                return false;
            }

            mapS[s.charAt(i)] = i+1;
            mapT[t.charAt(i)] = i+1;
        }

        return true;
    }


    public static void main(String[] args) {

    }
}
