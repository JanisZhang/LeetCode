package com.easy.List.twopointer;

/**
 * @link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 */
public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;

        for(int i=0; i < n;i++){
            p1 =p1.next;
        }

        if(p1 == null){
            return head.next;
        }

        while (p1!=null){ 
            p1 = p1.next;

            if(p1 == null){
                break;
            }

            p2 = p2.next;
        }

        p2.next = p2.next.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode node2 = new ListNode(2);
        ListNode node = new ListNode(1, node2);
        // [1,4,3,2,5,2]
        ListNode result = removeNthFromEnd(node2,1);
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
