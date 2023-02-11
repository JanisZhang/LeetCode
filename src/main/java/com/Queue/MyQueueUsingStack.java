package com.Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author JiaDi Zhang
 * @LeetCode: 232.Implement Queue using Stacks
 * @Link: Runtime: ms, Memory  MB
 * https://leetcode.com/problems/implement-queue-using-stacks/?envType=study-plan&id=data-structure-i
 * @date 2023/2/10
 */
public class MyQueueUsingStack {
    public static void main(String[] args) {
        MyQueueUsingStack queue = new MyQueueUsingStack();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.pop();
        queue.push(5);
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
    }

    Stack<Integer> input = new Stack<Integer>();
    Stack<Integer> outPut = new Stack<Integer>();

    public MyQueueUsingStack() { }

    public void push(int x) {
        input.push(x);
    }
    public int pop() {
        peek();
        return outPut.pop();
    }

    public int peek() {
        if (outPut.empty()) {
            while (!input.empty()) {
                outPut.push(input.pop());
            }
        }
        return outPut.peek();
    }

    public boolean empty() {
        return input.empty() && outPut.empty();
    }
}
