import collections
from typing import List

def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    result = collections.defaultdict(list)
    for s in strs:
        result[tuple(sorted(s))].append(s)
    return result.values()

class soulation:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = collections.defaultdict(list)
        for s in strs:
            count = [0] * 26
            for char in s:
                count[ord(char) - ord('a')] += 1
            ans[tuple(count)].append(s)
        return ans.values()

