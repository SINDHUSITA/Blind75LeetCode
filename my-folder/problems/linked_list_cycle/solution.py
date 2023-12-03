# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        # flag = 1 + 10**5
        # curr = head
        # while curr:
        #     if curr.val == flag:
        #         return True
        #     curr.val = flag
        #     curr = curr.next
        # return False
        fastP = head
        slowP = head
        while fastP and fastP.next:
            fastP = fastP.next.next
            slowP = slowP.next
            if slowP == fastP:
                return True
        return False
        
        