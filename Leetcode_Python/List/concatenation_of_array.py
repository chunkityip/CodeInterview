from typing import List

def getConcatenation(self, nums: List[int]) -> List[int]:
    length = len(nums)
    result = [0] * (length * 2)

    for i in range(length):
        result[i] = nums[i]
        result[i + length] = nums[i]

    return result