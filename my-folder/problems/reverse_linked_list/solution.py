# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # before = None
        # cur = head
        # while cur:
        #     after = cur.next
        #     cur.next = before
        #     before = cur
        #     cur = after
        # return before
        if not head or not head.next:
            return head
        temp = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return temp
    
