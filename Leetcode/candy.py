class Solution:
    def candy(self, ratings: List[int]) -> int:
        childCountCandy = [1] * len(ratings)

        for i in range(1, len(ratings)):
            if ratings[i] > ratings [i - 1]:
                childCountCandy[i]  = childCountCandy[i - 1] + 1
        for i in range(len(ratings) - 2, -1, -1):
             if ratings[i] > ratings[i + 1]:
                childCountCandy[i] = max(childCountCandy[i], childCountCandy[i + 1] + 1)
        return sum(childCountCandy)
