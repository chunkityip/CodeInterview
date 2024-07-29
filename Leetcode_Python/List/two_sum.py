def twoSum(self, nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[int]
    """
    map = {}
    for i in range(len(nums)):
        compare = target - nums[i]
        if compare in map:
            return [i, map[compare]]
        map[nums[i]] = i