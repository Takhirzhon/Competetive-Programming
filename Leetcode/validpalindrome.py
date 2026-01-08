class Solution:
    def isPalindrome(self, s: str) -> bool:
        palindrome = []
        for char in s:
            if char in " ?.!/;:":
             s.replace(char,'')
        for char in s:
            if char.isalnum(): 
                palindrome.append(char.lower())
        

        return (palindrome == palindrome[::-1])
    
if __name__ :
    s = Solution()
    text = "A man, a plan, a canal: Panama"
    print(s.isPalindrome(text))