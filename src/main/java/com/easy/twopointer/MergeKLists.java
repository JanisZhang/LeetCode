package com.easy.twopointer;

/**
 * @link: https://leetcode.com/problems/merge-k-sorted-lists/
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 *     Output: [1,1,2,3,4,4,5,6]
 *     Explanation: The linked-lists are:
 *             [
 *             1->4->5,
 *             1->3->4,
 *             2->6
 *             ]
 *     merging them into one sorted list:
 *             1->1->2->3->4->4->5->6
 */
public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {

        return null;
    }

    static class ListNode {
        int val;
        MergeTwoSortedLists.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, MergeTwoSortedLists.ListNode next) { this.val = val; this.next = next; }
    }
}
