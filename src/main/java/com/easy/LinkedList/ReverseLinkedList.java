package com.easy.LinkedList;

/**
 * @author JiaDi Zhang
 * @LeetCode: 206. Reverse Linked List
 * @Link:
 * https://leetcode.com/problems/reverse-linked-list/?envType=study-plan&id=data-structure-i
 * @date 2023/2/9
 */
public class ReverseLinkedList {
    /**
     * See explain: https://leetcode.com/problems/reverse-linked-list/solutions/2682085/java-0ms-100-easy-understanding/
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode previousHead = null;
        while (currentNode != null ){
            ListNode next = currentNode.next;
            currentNode.next = previousHead;
            previousHead = currentNode;
            currentNode = next;
        }
        return previousHead;
    }
}
