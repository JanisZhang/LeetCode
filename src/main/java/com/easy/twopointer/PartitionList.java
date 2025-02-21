package com.easy.twopointer;

/**
 * @link:https://leetcode.com/problems/partition-list/description/
 */
public class PartitionList {

//    Input: head = [1,4,3,2,5,2], x = 3
//    Output: [1,2,2,4,3,5]

    public static ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode p = dummy, q = dummy2;
        while (head != null) {
            if(head.val < x){
                p.next = head;
                p = p.next;
            }else {
                q.next = head;
                q = q.next;
            }
            head = head.next;
        }
        q.next = null;
        p.next = dummy2.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node6= new ListNode(2);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(4, node3);
        ListNode node = new ListNode(1, node2);

        ListNode result = partition(node,3);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    /**
     * Definition for singly-linked list.
     */
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}
