package Leetcode.Array;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int firstNumUniqueEmails(String[] emails) {
        //The idea was created a HashSet and add the Unique Email address by doing the following:

        //First , check the locate name
        //1.ignore the .
        //2.When the loop point to '+' or point to '@', break it
        //3.add it to HashSet

        //Second , check the domain name
        //1. point to last index , keep loop it until we found '@'
        //2. reverse it and add it to HashSet

        Set<String> set = new HashSet<>();

        for (String e : emails) {
            StringBuilder local = new StringBuilder();
            StringBuilder domain = new StringBuilder();

            for (int i = 0; i < e.length(); i++) {
                char c = e.charAt(i);
                if (c == '+' || c == '@') break;

                if (c != '.') local.append(c);
            }

            for (int i = e.length() - 1; i >= 0; i--) {
                char c = e.charAt(i);
                domain.append(c);
                if (c == '@') break;
            }

            domain = domain.reverse();
            local.append(domain);
            set.add(local.toString());
        }

        return set.size();
    }

    public int secondNumUniqueEmails(String[] emails) {
        //Using split() and replace()
        /* This is example:
        1. String string = "004-034556";
        2. String[] parts = string.split("-");
        3. String part1 = parts[0]; // 004
        4. String part2 = parts[1]; // 034556
         */

        //So we can split by using ('@') like second line
        //Create a String call local like third line

        Set<String> set = new HashSet<>();
        for (String e : emails) {
            String[] cleanEmail = e.split("@");
            String[] local = cleanEmail[0].split("\\+");

            set.add(local[0].replace(".", "") + "@" + cleanEmail[1]);
        }
        return set.size();
    }
}
