package Leetcode.Integer;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        long low = 0, high = n, mid, curr;
        while (low <= high) {
            mid = low + (high - low) / 2;
            curr = mid * (mid + 1) / 2;
            if (curr == n) return (int) mid;
            if (curr < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int) high;
    }
}
