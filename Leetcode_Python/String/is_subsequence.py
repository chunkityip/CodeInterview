class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        s_len, t_len = len(s), len(t)
        p_left = p_right = 0

        while p_left < s_len and p_right < t_len:
            if s[p_left] == t[p_right]:
                p_left += 1
            p_right += 1

        return p_left == s_len