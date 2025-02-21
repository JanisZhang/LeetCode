package com.easy.twopointer;

/**
 * @link; https://leetcode.com/problems/linked-list-cycle/
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head;
        if(p1 == null||p1.next == null){
            return false;
        }
        ListNode p2 = head;
        while(p2.next!=null&&p2.next.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2){
                return true;
            }
        }
        return false;
    }
}
