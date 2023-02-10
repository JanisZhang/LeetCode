package com.Queue;

/**
 * @author JiaDi Zhang
 * @LeetCode: 232.Implement Queue using Stacks
 * @Link:
 * https://leetcode.com/problems/implement-queue-using-stacks/?envType=study-plan&id=data-structure-i
 * @date 2023/2/10
 */
public class MyQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
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

    private static int[] elements;

    public MyQueue() {
        elements = new int[0];
    }

    public void push(int x) {
        int[] arr = new int[elements.length+1];
        for(int i=0;i< elements.length;i++){
            arr[i] = elements[i];
        }
        arr[elements.length] = x;
        elements = arr;
    }

    public int peek() {
        return elements[0];
    }

    public int pop() {
        int newArrLength = elements.length-1;
        int[] arr = new int[newArrLength];
        for(int i = 0;i<newArrLength;i++){
            arr[i] = elements[i+1];
        }
        int popValue = elements[0];
        elements = arr;
        return popValue;
    }

    public boolean empty() {
        if(elements.length==0){
            return true;
        }
        return false;
    }
}
