class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        gcd_len = gcd(len(str1), len(str2))
        divisor = str[:gcd_len]
        if str1 == divisor * (len(str1) // len(divisor)) and str2 == divisor * (len(str2) // len(divisor)):
            return divisor
        return ""
