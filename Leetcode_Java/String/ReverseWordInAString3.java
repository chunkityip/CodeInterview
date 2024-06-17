package Leetcode_Java.String;

public class ReverseWordInAString3 {

    public static void main (String [] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));  //Output: s'teL ekat edoCteeL tsetnoc
    }

    public static  String reverseWords(String s) {
        int lastSpaceIndex = -1;
        char[] c = s.toCharArray();
        int len = s.length();

        //We are looking for the space , if we found the space , it means we found the word
        //so the index i will keep count until we found the word
        for (int i = 0; i <= len; i++) {
            if (i == len || c[i] == ' ') {
                // Pointer startIndex points to the first character of every word.
                // Pointer endIndex points to the last character of every word based on the space.
                int startIndex = lastSpaceIndex + 1;
                int endIndex = i - 1;
                //swap , and then move forward as startIndex , move backward as endIndex
                while (startIndex < endIndex) {
                    char temp = c[startIndex];
                    /*
                    c[startIndex] = c[endIndex];
                    c[endIndex] = temp;
                    startIndex++;
                    endIndex--;
                    Instead of doing this , we can do the following:
                     */
                    c[startIndex++] = c[endIndex];
                    c[endIndex--] = temp;
                }
                //lastSpaceIndex will point to space index
                lastSpaceIndex = i;
            }
        }
        return new String(c);
    }
}
