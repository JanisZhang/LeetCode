package com.easy.twopointer;

/**
 * @link:https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                p.next = list1;
                list1 = list1.next;
            }else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }

        if(list1==null){
            p.next = list2;
        }

        if(list2==null){
            p.next = list1;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(4);

        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(3);
        listNode1.next.next = new ListNode(4);

        ListNode listNodeResult = mergeTwoLists(listNode, listNode1);
        while (listNodeResult != null) {
            System.out.println(listNodeResult.val);
            listNodeResult = listNodeResult.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}


/**
 * Definition for singly-linked list.
 *
 */
