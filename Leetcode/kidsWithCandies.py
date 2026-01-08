class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        arr = []
        max_candies = max(candies)


        for i in range(len(candies)):
            total = candies[i] + extraCandies
            if total >= max_candies:
                arr.append(True)

            else:
                arr.append(False)
        return arr 