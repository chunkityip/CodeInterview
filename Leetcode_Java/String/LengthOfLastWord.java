package Leetcode_Java.String;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int i = s.length()- 1 , count = 0;
        while (s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}
