package Leetcode.String;

public class IsSubsequence {
    /*
        We are using two pointer , one point to s index 0 , one point to t index0

        Using while loop to iterator s length and to t length

        if we find matching in both s and t , the pointer of s move forward;
        no matter we found the matching or not point to t will always move forward

        if the number of s point equal to the length of s , it means we found all the subsequence , return true
        */

    public boolean isSubsequence(String s, String t) {
        int sLen = s.length() , tLen = t.length();
        int sLeft = 0 , tLeft = 0;

            while (sLeft < sLen && tLeft < tLen) {
            if (s.charAt(sLeft) == t.charAt(tLeft)) {
                sLeft++;
            }
            tLeft++;
        }
            return sLeft == sLen;
    }
}
