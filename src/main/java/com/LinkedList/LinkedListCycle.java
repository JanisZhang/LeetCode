package com.LinkedList;

/**
 * @author JiaDi Zhang
 * @LeetCode: 141. Linked List Cycle
 * @Link:
 * https://leetcode.com/problems/linked-list-cycle/description/?envType=study-plan&id=data-structure-i
 * @date 2023/2/8
 */
class LinkedListCycle {

    /**
     * fast-slow method
     * @param head
     */
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public boolean hasCycle1(ListNode head) {
        while (head.next != null) {
            if (head.next.val ==  100000) {
                return true;
            }
            head.next.val = 100000;
            head = head.next;
        }
        return false;
    }

}
