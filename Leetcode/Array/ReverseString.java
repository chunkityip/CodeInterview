package Leetcode.Array;

public class ReverseString {

    public void reverseString(char[] s) {
        int startIndex = 0;
        int endIndex = s.length - 1;

        //Using two pointer to swap
        //startIndex point to beginning of char s
        //endIndex point to end of char s
        while (startIndex < endIndex) {
            char temp = s[startIndex];
            s[startIndex++] = s[endIndex];
            s[endIndex--] = temp;
        }
    }
}
