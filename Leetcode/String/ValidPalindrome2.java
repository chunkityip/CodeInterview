package Leetcode.String;

public class ValidPalindrome2 {

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
