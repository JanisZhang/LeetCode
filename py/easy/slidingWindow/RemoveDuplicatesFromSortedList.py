# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None

        slow = head
        fast = head

        while fast is not None:
            if fast.val != slow.val:
                slow.next = fast
                slow = slow.next
            fast = fast.next

        slow.next = None
        return head

class Solution2:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None

        curr = head

        while curr.next:
            if curr.val == curr.next.val:
                curr.next = curr.next.next
            else:
                curr = curr.next

        return head

list = ListNode(1)
list.next = ListNode(1)
list.next.next = ListNode(2)
print(Solution().deleteDuplicates(list).next.val)








