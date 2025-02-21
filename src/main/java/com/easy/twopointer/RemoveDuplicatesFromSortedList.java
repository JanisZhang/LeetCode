package com.easy.twopointer;

/**
 * @author JiaDi Zhang
 * @LeetCode: 83. Remove Duplicates from Sorted List
 * @Link:
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * @date 2024/7/22
 */
public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null){
            if(fast.val != slow.val) {
               slow.next = fast;
               slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode head= new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = deleteDuplicates(head);
        System.out.println(result.val);
        System.out.println(result.next.val);
        System.out.println(result.next.next.val);

    }

   static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }

    }
}
