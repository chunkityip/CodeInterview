def removeElement(self , nums: List[int], val: int) -> int:
    i = 0
    for j in range(len(nums)):
        if nums[i] != val:
            nums[i] = nums[j]
            i += 1
    return i