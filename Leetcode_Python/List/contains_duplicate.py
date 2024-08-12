from typing import List


class Solution:
    def contiansdDuplicate(self , nums: List[list]) -> bool:
        num_set = set()
        for num in nums:
            if num in num_set:
                return True
            num_set.add(num)
        return False