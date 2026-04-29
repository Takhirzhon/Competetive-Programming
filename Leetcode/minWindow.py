class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if t == "":
            return ""
        window, checkT = {}, {}

        for i in t:
            checkT[i] = 1 + checkT.get(i, 0)
        have, need = 0, len(checkT)
        res = [-1,-1]
        resLen = float("infinity")
        l = 0

        for r in range(len(s)):
            c = s[r]
            window[c] = 1 + window.get(c, 0)

            if c in checkT and window[c] ==checkT[c]:
                have += 1

            while have == need:
                if (r - l + 1) < resLen:
                    res = [l, r]
                    resLen = (r - l + 1)
                window[s[l]] -= 1
                if s[l] in checkT and window[s[l]] < checkT[s[l]]:
                    have -= 1
                l += 1
        l, r = res
        return s[l:r + 1] if resLen != float("infinity") else ""