package Leetcode_Java.Array;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        //We're basically comparing first array to the rest of array
        //Create a StringBuilder to store
        //if character i of first index of strs isn't match the index of strs , we are no longer comparing it

        //keep adding index into StringBuilder and finally return it as String

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++) {
            for(String s: strs)
                if(i == s.length() || s.charAt(i) != strs[0].charAt(i)) {
                    return sb.toString();
                }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}
