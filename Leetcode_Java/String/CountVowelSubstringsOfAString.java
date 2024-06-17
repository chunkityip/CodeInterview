package Leetcode_Java.String;


import java.util.HashSet;
import java.util.Set;

/*
The best and easy solution is actually using Brute Force

By using two loop left and right pointer:
1. left start from 0 and left++
2. right start at left and right++
	1. We need to check is the current char match vowel character which is a , e , i , o , u
		So we can create a Boolean method to check it.
		if the current char isn't vowel , break the loop
		 if yes , add it into HashSet and if the size of set is 5 which is all vowel characeter , have a count ++
 */

public class CountVowelSubstringsOfAString {
    public int countVowelSubstrings(String word) {
        int count = 0;
        for (int left = 0; left < word.length(); left++) {
            Set<Character> set = new HashSet<>();
            for (int right = left ; right < word.length(); right++) {
                char c = word.charAt(right);
                if (!isVowel(c)) break;

                set.add(c);
                if (set.size() == 5) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
