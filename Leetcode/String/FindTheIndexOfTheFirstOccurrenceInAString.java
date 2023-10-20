package Leetcode.String;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main (String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));   //Output: 0
    }

    public static int strStr(String haystack, String needle) {

        int first = -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i , needle.length() + i).equals(needle)) {
                first = i;
                break;
            }
        }
        return first;
    }
}
