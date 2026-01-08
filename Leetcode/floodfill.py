class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        oldColor = image[sr][sc]
        
        if image[sr][sc] == color:
            return image
        
        def bfs(sr, sc):
            q = deque()
            q.append((sr, sc))
            while q:
                r, c = q.popleft()
                image[r][c] = color
                for dr, dc in [(1,0), (-1,0), (0,1), (0,-1)]:
                    nr, nc = r + dr, c + dc
                    if 0 <= nr < rows and 0 <= nc < cols and image[nr][nc] == oldColor:
                        queue.append((nr, nc))

        bfs(sr, sc)
        return image


