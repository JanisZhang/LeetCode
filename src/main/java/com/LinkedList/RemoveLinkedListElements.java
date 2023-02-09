package com.LinkedList;

/**
 * @author JiaDi Zhang
 * @LeetCode: 203. Remove Linked List Elements
 * @Link:
 * https://leetcode.com/problems/remove-linked-list-elements/?envType=study-plan&id=data-structure-i
 * @date 2023/2/9
 */
public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(3);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        removeElements(listNode,3);
    }
    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.next.val == val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }
}
