package Leetcode.String;

import java.util.HashSet;

public class BuddyStrings {

    public static void main (String[] args) {
        System.out.println(buddyStrings("aa" , "aa")); //Output : true    
    }

    public static boolean buddyStrings(String s, String goal) {
        //Base case
        if (s.length() != goal.length()) return false;

        //We are checking are they equals or not
        //Situation 1 : if they are same , we are checking is any duplicate charter
        //If yes , return true
        //If no , return false
        if (s.equals(goal)) {
            HashSet<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                //s have duplicate charter so goal must have same duplicate charter as well
                if (set.contains(c)) {
                    return true;
                }
                set.add(c);
                }
            return false;
            //If they are not same
            //We are checking how much different character. The maximum can be 2 only
        } else {
            int firstDiff = -1 , secondDiff = -1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (firstDiff == -1) {
                        //We are swapping base on the index position and i will be it
                        firstDiff = i;
                    } else if (secondDiff == -1) {
                        secondDiff = i;
                        //the different more than 2
                    } else {
                        return false;
                    }
                }
            }
            return secondDiff != - 1 && s.charAt(firstDiff) == goal.charAt(secondDiff) &&
                    s.charAt(secondDiff) == goal.charAt(firstDiff);
        }
    }
}
