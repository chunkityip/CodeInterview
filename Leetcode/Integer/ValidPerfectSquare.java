package Leetcode.Integer;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {

    if (num < 2) return true;
    long left = 2 , right = num ,mid = 0, sum = 0;

    boolean mayAns = false;

    while (left <= right) {
        mid = left + (right - left) / 2;
        sum = mid * mid;
            if (sum == num) {
                mayAns = true;
                break;
        }

        if (sum > num) {
            right = mid - 1;
        } else {
            left = mid + 1;
            }
        }
        return mayAns;
    }
}
