package Leetcode.Integer;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        //The upperbound will be n , and lower-bound will be 0 since no matter what , we always have number 0
        long left = 0 , right = n , mid , curr;
        while (left <= right) {
            mid = left + (right - left) / 2;
            curr = mid * (mid + 1) / 2;

            if (curr == n) return (int)mid;

            if (n < curr) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int)right;
    }
}
