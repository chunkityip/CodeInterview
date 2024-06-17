package Leetcode_Java.String;

import java.util.Set;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    public int maxVowels(String s, int k) {
        /*
        Using Sliding window to do so

        Create a set to store all the vowels
        Create three integer , left , count and ans
        Iteator thu the length of s as int right ++

        if the index of right contains vowels , count + 1 , else , count + 0
        To avoid IndexOutOfBound , the length can't bigger then k , so if (right - left + 1 > k) , left pointer need to move forward
        Also , update the value of count , is the index left contains vowels ? if yes , count - 1 , else , count - 0
        left pointer ++;

        and then we are comparing which one is bigger , count or ans

        return ans;
        */

        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');
        /*
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        */

        //Collections.addAll(set , 'a' , 'e' , 'i' , 'o' , 'u');

        int left = 0 , count = 0, ans = 0;

        for (int right = 0; right < s.length(); right++) {
            count += set.contains(s.charAt(right)) ? 1 : 0;
            //The length is bigger than k , time to slide
            if (right - left + 1 > k) {
                count -= set.contains(s.charAt(left)) ? 1 : 0;
                left++;
            }
            ans = Math.max(count , ans);
        }
        return ans;
    }
}
