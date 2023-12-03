package Leetcode.Company.JPMorgan;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams {

    public List<String> removeAnagrams(String[] words) {
        //This question highly asked by JPMorgan

        //The idea is to compare any Anagrams found
        //If yes , delete those anagrams and return non-Anagrams on it

        //We can sort the words , it will show us which object in words is anagrmas
        //For example : ["abba","baba","bbaa","cd","cd"]
        //It becomes : "aabb" , "aabb" , "aabb" , "cd" , "cd"
        //Create a new String call compare and new String call sorted
        // will compare the compare object using equals()
        //If there have no anagrams yet , creating a new LinkedList and store the original words[] object

        String compare = "";
        List<String> list = new LinkedList<>();

        for (String word : words) {
            char[] c = word.toCharArray();
            Arrays.sort(c);

            String sorted = String.valueOf(c);
            if (!sorted.equals(compare)) {
                list.add(word);
                compare = sorted;
            }
        }
        return list;
    }
}

