package Leetcode.String;

public class SubstringsofSizeThreewithDistinctCharacters {
    public int countGoodSubstrings(String s) {
        int ans = 0;
        char[] c = s.toCharArray();

        //Length 3 at the time , so s.length() - 2
        for (int i = 0; i < s.length() - 2; i++) {
            if (c[i] != c[i + 1] && c[i] != c[i + 2] && c[i + 1] != c[i + 2]) {
                ans++;
            }
        }
        return ans;
    }
}
