package com.easy.List.twopointer;

/**
 * @link：https://leetcode.com/problems/linked-list-cycle-ii/description/
 */
public class LinkedListCycle2 {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            // 小学数学，追击问题。
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // 添加指向head 并且获取环头节点的逻辑
                slow = head;
                if (slow == slow.next.next) {
                    return head;
                }
                while (slow.next != null) {
                    slow = slow.next;
                    fast = fast.next;
                    if (slow == fast) {
                        slow.next = null;
                        return slow;
                    }
                }
            }
        }

        // 都走到这了...那就不成环，返回null
        return null;
    }
}
