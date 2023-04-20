class Solution:
    def validMountainArray(self, arr: List[int]) -> bool:
        max_ind = arr.index(max(arr))
        left, right = arr[:max_ind], arr[max_ind:]
        if len(left) == 0 or len(right) <= 1:
            return False
        if len(set(left))==len(left) and sorted(left) ==left:
            if len(set(right))==len(right) and sorted(right,reverse=True) ==right:
                return True
        return False
        
        
#         _breakpoint = 0
#         for i in range(len(arr)-1):
#             if arr[i] == arr[i+1]:
#                 return False
#             if arr[i+1]<arr[i]:
#                 _breakpoint = i
#                 break

#         if _breakpoint!=0 and len(arr[_breakpoint:]) == len(set(arr[_breakpoint:])) and sorted(arr[_breakpoint:],reverse=True) == arr[_breakpoint:]:
#             return True
#         else:
#             return False
            