package Leetcode.String;

public class IsSubsequence {
    /*
        We need two pointer , one point to s , one point to t
        we also need to avoid indexOutOfBound in s and t

        so the both pointer can't be larger than the length of s or t

        if we found same charater from both pointer , pointer i will move forward
        else , pointer j will move forward since we need to keep comparing

        At the end , the number of pointer i must be equals to the length of s so we know they are Subsequence


        while the pointer i is samller than the length of s  , and
        while the pointer j is samller than the length of t  {

            if character of pointer i is equals to character of pointer j {
            pointer i will move forward
            }
            pointer j will move forward
        }

        If the number of pointer i equals to the length of s , return true
        */
    public boolean isSubsequence(String s , String t) {
        int i = 0 , j = 0;
        int sLen = s.length() , tLen = t.length();

        while (i < sLen && j < tLen) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == sLen;
    }
}
