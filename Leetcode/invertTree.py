class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root:
            return None
        tmp = root.left
        root.left = root.right
        root.right = tmp

        self.invertTree(root.left)
        self.invertTree(root.right)
        return root
    
# class Solution:
#     def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
#         if not root:
#             return None
#         root.left, root.right = self.invertTree(root.right), self.invertTree(root.left)
#         return root

# class Solution:
#     def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
#         if not root:
#             return None
#         r = self.invertTree(root.right)
#         l = self.invertTree(root.left)
        
#         root.left = r
#         root.right = l
#         return root