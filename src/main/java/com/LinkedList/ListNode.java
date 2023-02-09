package com.LinkedList;

/**
 * @author JiaDi Zhang
 * @LeetCode: 141. Linked List Cycle
 * @Link:
 * https://leetcode.com/problems/linked-list-cycle/description/?envType=study-plan&id=data-structure-i
 * @date 2023/2/8
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}