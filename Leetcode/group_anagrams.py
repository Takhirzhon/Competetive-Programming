class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs:
          return []
        
        wordsGroup = defaultGroup(list)
        
        
        
if __name__ == "__main__":
    s = Solution()
    print(s.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
    print(s.groupAnagrams([""]))