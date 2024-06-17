package Leetcode_Java.Integer;

public class SqrtX {
    public int mySqrt(int x) {
        int left = 0 , right = x , mid = 0 , mayAns = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if ((long) mid * mid <= (long)x) {
                mayAns = mid;
                left = mid + 1;
            } else if ((long) mid * mid > (long)x) {
                right = mid - 1;
            }
        }
        return mayAns;
    }
}
