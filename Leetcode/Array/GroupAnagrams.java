package Leetcode.Array;

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

    public List<List<String>> groupAnagrams(String[] strs) {
        //Using ASCII code to count is same number or not

        if (strs.length == 0) return new ArrayList<>();
        HashMap<String , List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                //sb.append('#'); is used to separate the counts of different characters.
                //This is done to ensure that different anagram groups have distinct keys
                sb.append(count[i]);
                sb.append('#');
            }

            String key = sb.toString();

            //if (!map.containsKey(key)) map.put(key , new ArrayList());
            map.putIfAbsent(key , new ArrayList<>());

            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

}
