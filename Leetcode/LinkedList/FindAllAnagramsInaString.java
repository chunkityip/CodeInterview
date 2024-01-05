package Leetcode.LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsInaString {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character , Integer> sMap = new HashMap<>();
        HashMap<Character , Integer> pMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        int pLen = p.length();
        int sLen = s.length();

        if (sLen < pLen) return list;

        for (int i = 0; i < pLen; i++) {
            sMap.put(s.charAt(i) , sMap.getOrDefault(s.charAt(i) , 0) + 1);
            pMap.put(p.charAt(i) , pMap.getOrDefault(p.charAt(i) , 0) + 1);
        }

        if (sMap.equals(pMap)) list.add(0);

        int left = 0;
        while (pLen < sLen) {
            char put = s.charAt(pLen);
            sMap.put(put , sMap.getOrDefault(put, 0) + 1);
            pLen++;

            char remove = s.charAt(left);
            sMap.put(remove , sMap.get(remove) - 1);
            if (sMap.get(remove) == 0) sMap.remove(remove);
            left++;

            if (sMap.equals(pMap)) list.add(left);
        }
        return list;
    }
}
