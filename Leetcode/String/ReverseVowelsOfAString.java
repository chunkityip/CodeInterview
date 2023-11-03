package Leetcode.String;

public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {
        int start = 0 , end = s.length() - 1;
        char[] c = s.toCharArray();

        while (start < end) {
            //This will check is character vowels or not.
            //It isn't , move forward to one
            while (start < s.length() && !isVowels(c[start])) {
                start++;
            }

            //It isn't , move backword to one
            while (end >= 0 && !isVowels(c[end])) {
                end--;
            }

            //The char is vowels , swap
            if (start < end) {
                swap(c , start++ , end--);
            }
        }
        return new String(c);
    }

    boolean isVowels(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
                || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }

    void swap(char[] c , int i , int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

}
