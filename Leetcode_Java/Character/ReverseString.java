package Leetcode_Java.Character;

public class ReverseString {

    public void reverseString(char[] s) {
        int first = 0;
        int end = s.length - 1;

        while (first < end) {
            char temp = s[first];
            s[first] = s[end];
            s[end] = temp;

            first++;
            end--;
        }
    }
}
