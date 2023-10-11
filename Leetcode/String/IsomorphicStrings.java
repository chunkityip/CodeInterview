package Leetcode.String;

import java.util.HashMap;

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

        HashMap<Character , Character> map1 = new HashMap<>();
        HashMap<Character , Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            //We are checking is map1.value match to t.charAt(i)
            if (map1.containsKey(s.charAt(i))) {
                if (map1.get(s.charAt(i)) != t.charAt(i)) return false;
            }

            //We are checking is map1.value match to t.charAt(i)
            if (map2.containsKey(t.charAt(i))) {
                if (map2.get(t.charAt(i)) != s.charAt(i)) return false;
            }

            map1.put(s.charAt(i) , t.charAt(i));
            map2.put(t.charAt(i) , s.charAt(i));
        }

        return true;
    }
}
