package Leetcode_Java.Company.JPMorgan;

import java.util.HashMap;

public class CheckWhetherTwoStringsAreAlmostEquivalent {

    //This question highly asked by JPMorgan

    public boolean checkAlmostEquivalent(String word1 , String word2) {
        int[] c = new int[26];


        //Since English character has 26 , each represent a character
        //index a as 0. If word1.charAt(i) is a , a - a will be 0 , so we ++ index 0
        //index b as b. If word1.charAt(i) is b , b - a will be 1 , so we ++ index 1

        //then we are -- to compare word2.charAt(i)
        //using word1 = "aaaa", word2 = "bccb" as example
        //word 1 has four a so c[0] is 4 now
        //word 2 has zero a so c[0] still 4 , return false

        for (int i = 0; i < word1.length(); i++) {
            c[word1.charAt(i) - 'a']++;
            c[word2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (Math.abs(c[i]) > 3) {
                return false;
            }
        }
        return true;
    }

    //My solution
    public boolean checkAlmostEquivalent2(String word1, String word2) {
        //Edge case
        if (word1.length() != word2.length()) return false;

        //The question is asking if the differences between the frequencies of each letter from 'a' to 'z' between word1 and word2 is at most **3**

        //We can use HashMap , key as their each character and value as how many times they have (getOrDefault() + 1)
        //then we can Math.abs(word1.get() - word2.get()) to check is their value smaller or equals to 3
        //If yes , return true , else , return false

        //Step:
        //1. Create HashMap for word1
        //2. Create HashMap for word2
        //3. Keep checking is any value is bigger than 3 .
            //a. If yes , return false
            //b. If no , continue

        HashMap<Character , Integer> map1 = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();

        //Step1
            for (char c : word1.toCharArray()) {
            map1.put(c , map1.getOrDefault(c , 0) + 1);
        }

        //Step2
            for (char c : word2.toCharArray()) {
            map2.put(c , map2.getOrDefault(c , 0) + 1);
        }

        //Step3
            for (int c = 'a'; c <= 'z'; c++) {
            int count1 = map1.getOrDefault((char)c , 0);
            int count2 = map2.getOrDefault((char)c , 0);

            if (Math.abs(count1 - count2) > 3) {
                return false;
            }
        }
            return true;
        }
}
