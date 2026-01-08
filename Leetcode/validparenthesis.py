class Solution:
    def isValid(self, s: str) -> bool:
        
        stack = []
        bracket_map = {')': '(', '}': '{', ']': '['}
        
        for char in s:
            if char in bracket_map.values():
                stack.append(char)
            elif char in bracket_map.keys():
                if not stack or stack[-1] != bracket_map[char]: 
                    return False
                stack.pop()             
        return len(stack) == 0  


# class Solution:
#     def isValid(self, s: str) -> bool:
#         valid = []
#         pairs = {')': '(', ']': '[', '}': '{'}
#         for ch in s:
#             if ch not in pairs:
#                 valid.append(ch)
#             else:
#                 if (len(valid) != 0 and valid[-1]==pairs[ch]):
#                     valid.pop()
#                 else:
#                     return False
#         if(len(valid)!=0):
#             return False
#         else:
#             return True 
    