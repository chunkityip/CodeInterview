package Leetcode.Array;

import java.util.*;

public class GroupAnagrams {


    //Using sort() method
    public List<List<String>> groupAnagrams(String[] strs) {
        //Sort the array and put it into HashMap
        //String as key and the list as value
        //"aer" : ["are" , "ear" , "era"]

        if (strs.length == 0) return new ArrayList<>();
        HashMap<String , List<String>> map = new HashMap<>();

        for (String s : strs) {
            //Since only array has sort() method , we need to change it as Array and then back to String
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            //if (!map.containsKey(key)) map.put(key , new ArrayList());
            map.putIfAbsent(key , new ArrayList<>());

            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagramsTwo(String[] strs) {
        //Using ASCII code to count is same number or not

        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            String key = String.valueOf(ca);
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
