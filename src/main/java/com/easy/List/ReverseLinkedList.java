package com.easy.List;


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
//    public static ListNode reverseList(ListNode head) {
//        ListNode currentNode = head;
//        ListNode previousHead = null;
//        while (currentNode != null ){
//            ListNode next = currentNode.next;
//            currentNode.next = previousHead;
//            previousHead = currentNode;
//            currentNode = next;
//        }
//        return previousHead;
//    }
    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverse(head.next);

        head.next.next = head;

        head.next = null;

        return last;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node = new ListNode(1, node2);

        reverse(node);
    }
    
    
}
