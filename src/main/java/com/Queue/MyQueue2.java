package com.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author JiaDi Zhang
 * @LeetCode: 232.Implement Queue using Stacks
 * @Link: Runtime: 0ms, Memory 40.2 MB
 * https://leetcode.com/problems/implement-queue-using-stacks/?envType=study-plan&id=data-structure-i
 * @date 2023/2/10
 */
public class MyQueue2 {
    public static void main(String[] args) {
        MyQueue2 queue = new MyQueue2();
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

    private static List<Integer> list;

    public MyQueue2() {
        list = new LinkedList<Integer>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int peek() {
        return list.get(0);
    }

    public int pop() {
        Integer value = list.get(0);
        list.remove(value);
        return value;
    }

    public boolean empty() {
        return list.isEmpty();
    }
}
