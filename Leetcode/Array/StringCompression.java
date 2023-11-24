package Leetcode.Array;

public class StringCompression {
    public int compress(char[] chars) {
        int i = 0 , index = 0;
        while (i < chars.length) {
            int groupOfLength = i;
            //We are checking how many number are same
            while (groupOfLength < chars.length && chars[groupOfLength] == chars[i]) {
                groupOfLength++;
            }
            chars[index++] = chars[i];
            //We have duplicate number , we need to change as char to add into chars[] array
            if (groupOfLength - i > 1) {
                String count = groupOfLength - i + "";
                for (char c : count.toCharArray()) {
                    chars[index++] = c;
                }
            }
            i = groupOfLength;
        }
        return index;
    }
}
