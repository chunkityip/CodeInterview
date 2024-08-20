def replaceElements(self, arr):
    """
    :type arr: List[int]
    :rtype: List[int]
    """
    right_max = -1
    for i in range(len(arr) - 1, -1, -1):
        next_max = max(arr[i], right_max)
        arr[i] = right_max
        right_max = next_max
    return arr