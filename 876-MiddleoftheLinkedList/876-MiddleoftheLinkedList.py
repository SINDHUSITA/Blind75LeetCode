# Last updated: 6/11/2025, 8:44:41 AM
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = fast = head
        while fast and fast.next:
            if fast.next.next is not None:
                fast = fast.next.next
            else:
                fast = fast.next
            # fast = fast.next.next --More Memory 
            slow = slow.next
        return slow