class Solution:
    def isValid(self, s: str) -> bool:
        unique = []
        for char in s:
            unique.append(char)
        for char in s:
            if char == '(' or char or char == '{' or char == '[':
                unique.append(char)
            elif char == ')' or char == '}' or char == ']':
                if not unique:
                    return False
                top = unique.pop()
                if (char == ')' and top != '(') or (char == '}' and top != '{') or (char == ']' and top != '['):
                    return False  # Mismatch in brackets
        
        # If the stack is empty, all brackets are matched
        return not unique
                    
                
            
            
           
        
        
if __name__ == "__main__":
    s = Solution()
    print(s.isValid("()")) # True
    print(s.isValid("()[]{}")) # True
    print(s.isValid("(]")) # False
    print(s.isValid("([)]")) # False
    print(s.isValid("{[]}")) # True
            
        