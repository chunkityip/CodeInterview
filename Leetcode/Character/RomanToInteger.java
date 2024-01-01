package Leetcode.Character;

public class RomanToInteger {

    public int roman (char c) {
        switch(c){
            case'I' : return 1;
            case'V' : return 5;
            case'X' : return 10;
            case'L' : return 50;
            case'C' : return 100;
            case'D' : return 500;
            case'M' : return 1000;
        }
        return 0;
    }

    public int romanToInt(String s) {
        if (s.length() == 0) return 0;
        int len = s.length();
        int ans = roman(s.charAt(len - 1));
        for (int i = len - 2; i >=0; i--) {
            if (roman(s.charAt(i)) >= roman(s.charAt(i + 1))) {
                ans += roman(s.charAt(i));
            } else {
                ans -= roman(s.charAt(i));
            }
        }
        return ans;
    }
}
