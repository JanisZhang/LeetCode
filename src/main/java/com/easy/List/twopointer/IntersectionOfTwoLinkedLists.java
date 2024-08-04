package com.easy.List.twopointer;

/**
 * @link：https://leetcode.com/problems/intersection-of-two-linked-lists/description/
 */
public class IntersectionOfTwoLinkedLists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) {
            return headA;
        }

        if (headA.next == null && headB.next == null) {
            return null;
        }

        if (headA.next == headB) {
            return headB;
        }

        if (headB.next == headA) {
            return headA;
        }

        ListNode nodeA = headA;

        while (true) {
            if (nodeA.next == null) {
                nodeA.next = headA;
                break;
            }
            nodeA = nodeA.next;
        }

        ListNode slow = headB;
        ListNode fast = headB;
        ListNode result = null;
        Boolean flag = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = headB;

                while (true) {
                    slow = slow.next;
                    fast = fast.next;
                    if (slow == fast) {
                        result = slow;
                        flag = true;
                        break;
                    }
                }
            }

            if (flag) {
                break;
            }
        }

        ListNode listNode = headA.next;

        while (true) {
            if (listNode.next == headA) {
                listNode.next = null;
                break;
            }
            listNode = listNode.next;
        }

        return result;
    }

    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB){
        ListNode node1 = headA, node2 = headB;

        while (node1 != node2) {
            if(node1 == null) {
                node1 = headB;
            }else {
                node1 = node1.next;
            }

            if(node2 == null) {
                node2 = headA;
            }else {
                node2 = node2.next;
            }
        }

        return node1;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(5);
        ListNode node2 = new ListNode(4,node3);
        ListNode node1 = new ListNode(8,node2);
        //---

        ListNode l1n = new ListNode(1, node1);
        ListNode l1 = new ListNode(4,l1n);
//        ListNode l1 = new ListNode(4,l1n);

        ListNode l2nn = new ListNode(1, node1);
        ListNode l2n = new ListNode(6, l2nn);
        ListNode l2 = new ListNode(5,l2n);

//        ListNode l1 = new ListNode(2);
//        ListNode l2 = new ListNode(1, l1);

        System.out.println(getIntersectionNode2(l1,l2).val);
    }
}
