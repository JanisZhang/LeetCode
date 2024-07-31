package com.easy.List.twopointer;

/**
 * @link:https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleNode {
    public static ListNode middleNode(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while(p2!=null &&p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node = new ListNode(1, node2);

        ListNode result = middleNode(node);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    
    /**
     * Definition for singly-linked list.
     */
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
