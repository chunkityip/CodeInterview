package Leetcode_Java.Array;

public class CheckIfTwoStringArraysAreEquivalent {

    public static void main (String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1 , word2)); //Output : true
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder storeWord1 = new StringBuilder();
        StringBuilder storeWord2 = new StringBuilder();

        for (String s1 : word1) {
            storeWord1.append(s1);
        }
        for (String s2 : word2) {
            storeWord2.append(s2);
        }


        //compareTo() is to check unicode number for each character and compare it
        //For example : ["a", "cb"], word2 = ["ab", "c"]
        //a compareTo a is 0 , c compareTo b is 1 .......
        //return 0 if all the character match
        return storeWord1.compareTo(storeWord2) == 0;
    }
}
