package com.stack;

import java.util.Stack;

/**
 * @author JiaDi Zhang
 * @LeetCode: 20. Valid Parentheses
 * @Link: Runtime: ms, Memory  MB
 * https://leetcode.com/problems/valid-parentheses/description/?envType=study-plan&id=data-structure-i
 * @date 2023/2/11
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();

        for (char ch: s.toCharArray()) {
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }
}
