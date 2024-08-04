package com.easy.List;


/**
 * @author JiaDi Zhang
 * @LeetCode: 21. Merge Two Sorted Lists
 * @Link:
 * https://leetcode.com/problems/merge-two-sorted-lists/?envType=study-plan&id=data-structure-i
 * @date 2023/2/9
 */
public class MergeTwoSortedList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode last = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                last.next = list1;
                list1 = list1.next;
            }else {
                last.next = list2;
                list2 = list2.next;
            }
            last = last.next;
        }
        if (list1 == null){
            last.next = list2;
        }else {
            last.next = list1;
        }
        return dummy.next;
    }

}
