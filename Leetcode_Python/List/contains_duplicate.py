from typing import List


class Solution:
    # Solution1: Using HashSet to sort the num , if the current number already continue at HashSet,
    # it means we have duplication number
    def contiansdDuplicate(self, nums: List[list]) -> bool:
        num_set = set()
        for num in nums:
            if num in num_set:
                return True
            num_set.add(num)
        return False

    # Solution2:
    # if the length of hashset is shorter than the length of list , it means we have duplicate number
    # Since hashset didn't allow any duplicate number into it
    def contiansDuplicateTwo(self, nums: List[list]) -> bool:
        return True if len(set(nums)) < len(nums) else False
