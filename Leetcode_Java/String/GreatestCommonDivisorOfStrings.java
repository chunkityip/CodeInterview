package Leetcode_Java.String;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        for (int i = Math.min(len1, len2); i > 0; i--) {
            if (isDivisor(str1.substring(0, i), str1) && isDivisor(str1.substring(0, i), str2)) {
                return str1.substring(0, i);
            }
        }

        return "";
    }

    private boolean isDivisor(String divisor, String str) {
        int len = str.length();
        if (len % divisor.length() != 0) {
            return false;
        }

        int factor = len / divisor.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < factor; i++) {
            sb.append(divisor);
        }
        return str.equals(sb.toString());
    }
}
