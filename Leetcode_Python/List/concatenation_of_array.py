from typing import List

def getConcatenation(self, nums: List[int]) -> List[int]:
    length = len(nums)
    newNums = [0] * (length * 2)

    for i in range(length):
        newNums[i] = nums[i]
        newNums[i + length] = nums[i]

    return newNums