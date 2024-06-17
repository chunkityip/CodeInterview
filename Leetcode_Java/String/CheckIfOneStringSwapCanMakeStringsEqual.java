package Leetcode_Java.String;

import java.util.ArrayList;

public class CheckIfOneStringSwapCanMakeStringsEqual {
    public static void main (String [] args) {
        System.out.println(areAlmostEqual("bank" , "kanb"));   //Output:  true
    }
        public static boolean areAlmostEqual(String s1, String s2) {
            //Base case
            if(s1.equals(s2)) return true;

            //We are using ArrayList to add the different char
            //The reason for using an ArrayList is to keep track where the diff in the s1 and s2
            ArrayList<Integer> list = new ArrayList<>();

            boolean isEqual = false;

            for(int i = 0; i < s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i)) list.add(i);
            }

            //If there are more differences between the inputs than the total number of inputs (n), they can't be same through swaps
            if(list.size() > 2) return false;

            if(list.size() == 2)
            {
                //i is first diff char , j is second diff char
                int i = list.get(0) , j = list.get(1);
                isEqual = (s1.charAt(i) == s2.charAt(j)) && (s1.charAt(j) == s2.charAt(i));
                return isEqual;
            }

            return isEqual;
        }

}
