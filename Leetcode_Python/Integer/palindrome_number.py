def isPalindrome(self, x):
    """
    :type x: int
    :rtype: bool
    """
    if x < 0:
        return False
    palindrome = 0;
    dummy = x;

    while dummy != 0:
        curr = dummy % 10
        palindrome = palindrome * 10 + curr
        dummy /= 10

    return palindrome == x;