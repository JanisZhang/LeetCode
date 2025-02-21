package com.easy.twopointer;

public class FindFromEnd {
    /**
     * 返回链表的倒数第 k 个节点
     * @param head
     * @param k
     * @return
     */
    static ListNode findFromEnd(ListNode head, int k) {
        ListNode p1 = head;
        ListNode p2 = head;
//        while(p1 != null){
//            if(k > 0){
//                p1 = p1.next;
//                k--;
//                continue;
//            }
//            p1 = p1.next;
//            p2 = p2.next;
//            if(p1 == null){
//                return p2;
//            }
//        }
//        return null;
        for(int i=0;i<k;i++){
            p1 = p1.next;
        }

        while (p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }

    public static void main(String[] args) {
        ListNode node6= new ListNode(2);
        ListNode node5= new ListNode(5, node6);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(4, node3);
        ListNode node = new ListNode(1, node2);

        System.out.println(findFromEnd(node,2).val);
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
