def replaceElements(self, arr):
    """
    :type arr: List[int]
    :rtype: List[int]
    """
    rightMax = -1
    for i in range(len(arr) - 1, - 1, - 1):
        nextMax = max(arr[i], rightMax)
        arr[i] = rightMax
        rightMax = nextMax

    return arr