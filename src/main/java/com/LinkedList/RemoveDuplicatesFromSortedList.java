package com.LinkedList;

/**
 * @author JiaDi Zhang
 * @LeetCode: 83. Remove Duplicates from Sorted List
 * @Link:
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/?envType=study-plan&id=data-structure-i
 * @date 2023/2/9
 */
public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(3);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        deleteDuplicates(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
        while (list != null) {
            if (list.next == null) {
                break;
            }
            if (list.val == list.next.val){
                list.next = list.next.next;
            }else {
                list = list.next;
            }
        }
        return head;
    }
}
