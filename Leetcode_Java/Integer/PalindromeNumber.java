package Leetcode_Java.Integer;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int palindrome = 0;
        int dummy = x;

        while (dummy != 0) {
            int curr = dummy % 10;
            dummy /= 10;
            palindrome = palindrome * 10 + curr;
        }
        return palindrome == x;
    }
}
