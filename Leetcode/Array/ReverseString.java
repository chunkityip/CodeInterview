package Leetcode.Array;

public class ReverseString {

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    //JS version
    var reverseString = function(s) {
        let left = 0 , right = s.length - 1;
        while (left <= right) {
        [s[left], s[right]] = [s[right], s[left]];
            left++;
            right--;
        }
    };
}
