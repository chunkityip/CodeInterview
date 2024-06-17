package Leetcode_Java.Integer;

public class ReverseInteger {
    public int reverse(int x) {
        int reverse = x;
        int ans = 0;

        while (reverse != 0) {
            int digit = reverse % 10;
            reverse /= 10;

            if (ans > Integer.MAX_VALUE / 10 || ans == Integer.MAX_VALUE / 10 && digit > 7) return 0;
            if (ans < Integer.MIN_VALUE / 10 || ans == Integer.MIN_VALUE / 10 && digit < -8) return 0;

            ans = ans * 10 + digit;
        }

        return ans;
    }
}
