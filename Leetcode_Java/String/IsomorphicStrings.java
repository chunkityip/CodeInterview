package Leetcode_Java.String;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main (String[] args) {
        System.out.println(isIsomorphic("egg" , "add")); // Output: true
        System.out.println(isIsomorphic("foo" , "bar")); // Output: false
    }

    public static boolean isIsomorphic(String s, String t) {
        //Base case
        if (s.length() != t.length()) return false;

        //Here is the step:
        //We will create two HashMap , map1 and map 2
        //We put s as key , t as value into map1
        //We put t as key , s as value into map2
        //So map.get(s) which is value t should match t.charAt(t) which is value t

        //For example:
        //s = "egg", t = "add"
        //map1.get(s.charAt(0)) is 'a' and t.charAt(0) is 'a' , so match
        //map2.get(t.charAt(0)) is 'e' and s.charAt(0) is 'e' , so match

        Map<Character , Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) return false;
            } else {
                // This insure the value of charT can't be show it again
                // egg and add.
                // e match to a. If there have another a , that isn't isomorphic
                // g match to d. If there have another d , that isn't isomorphic

                // For example
                // foo and bar
                // f match to b
                // o match to a
                // map already contains o as key , but the next match point to o to r but pervious match show o match to a
                // if (map.get(charS) != charT) return false;


                if (map.containsValue(charT)) return false;
                map.put(charS , charT);
            }
        }
        return true;
    }
}
