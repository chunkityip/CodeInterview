package Leetcode.String;

public class ValidPalindrome2 {
    /*
        Whenever the question is asking Palindrome , we should use two pointer
        one pointer point to left index and one point to right index
        The starting and ending must be same as Palindrome look likes

        However , the question is asking can deleting at most one character

        For example : aaaaxa
        After deleting x , we get "aaaaa" , so it is palindrome
        So baiscally if left++ and right-- isn't match ,
        we are comparing left + 1 to right OR left to right - 1
        It looks like :
            a a a a x a
            ^         ^
           left     right

        a == a , left ++ , right--

            a a a x
            ^     ^
          left   right

        a != x , is left + 1 as 'a' match right as 'x'  OR  is left as 'a' match right - 1 as 'a' ?
        If one of it match , return true , else return false

        */

    public boolean validPalindrome(String s) {
        //If the pointer i and pointer j are not match , we are deleting one of the character
        //by simply i + 1 and j - 1
        int i = 0 , j = s.length() - 1;

        while (i < j){
            if (s.charAt(i) != s.charAt(j)) {
                return isPalidrome(s , i + 1 , j) || isPalidrome(s , i , j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    //Two pointers : i start at 0 and j start at s.length() - 1;
    //Checking are index i char and index j char are same or not
    //Pointer i keep going forward , j keep going backward
    private boolean isPalidrome(String s , int i , int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
