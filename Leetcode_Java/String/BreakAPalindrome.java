package Leetcode_Java.String;

public class BreakAPalindrome {
    ///This question highly asked by JPMorgan

    /*First , what is Palindrome
    Think of Palindrome is an image, and we are using a mirror ,
            palindrome = "aa"

    a | a

    left image is same as right image

    Now the question is asking to break a palindrome. What we need to break is the left image.
    Also , the question is asking for *lexicographically smallest* one possible
    The question gave us the hint as 'a' always smaller then 'b'
    Just loop the left index of palindrome. If there are any char isn't a m change to 'a'.

    What about all lft index are 'a'? Just change the last index to b
    For example : "aaaa"
    changing the last index will be 'aaab' , we break the palindrome

    */
    public String breakPalindrome(String palindrome) {
        int len = palindrome.length();
        if (len == 1) return "";

        char[] c = palindrome.toCharArray();

        for (int i = 0; i < len / 2; i++) {
            if (c[i] != 'a') {
                c[i] = 'a';

                return String.valueOf(c);
            }
        }

        c[len - 1] = 'b';
        return String.valueOf(c);
    }
}
