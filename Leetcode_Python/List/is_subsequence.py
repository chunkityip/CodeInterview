def isSubsequence(self, s: str, t: str) -> bool:
    sLen, tLen = len(s), len(t)
    i, j = 0, 0

    while i < sLen and j < tLen:
        if s[i] == t[j]:
            i += 1
        j += 1
    return i == sLen