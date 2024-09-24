package com.easy.string.twopointer;

import java.util.Stack;

/**
 * @leetcode: https://leetcode.com/problems/backspace-string-compare
 * /description/
 */
public class BackspaceStringCompare {
//    Example 1:
//    Input: s = "ab#c", t = "ad#c"
//    Output: true
//    Explanation: Both s and t become "ac".
//
//    Example 2:
//    Input: s = "ab##", t = "c#d#"
//    Output: true
//    Explanation: Both s and t become "".
//
//    Example 3:
//    Input: s = "a#c", t = "b"
//    Output: false
//    Explanation: s becomes "c" while t becomes "b".

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> characters = new Stack<>();
        for(char c:s.toCharArray()){
            if (c == '#') {
                if (!characters.isEmpty()) {
                    characters.pop();
                }
            }else {
                characters.push(c);
            }
        }

        Stack<Character> characters2 = new Stack<>();
        for(char c:t.toCharArray()){
            if (c == '#') {
                if (!characters2.isEmpty()) {
                    characters2.pop();
                }
            }else {
                characters2.push(c);
            }
        }

        if (characters.size() != characters2.size()) {
            return false;
        }

        for (int i=0; i< characters.size();i++){
            if(characters.get(i) != characters2.get(i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare( "a#c", "b"));
        System.out.println(backspaceCompare( "a##c", "#a#c"));
        System.out.println(backspaceCompare( "y#fo##f", "y#f#o##f"));
    }
}
