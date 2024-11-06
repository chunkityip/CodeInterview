package Leetcode_Java.String;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String e : emails) {
            StringBuilder local = new StringBuilder();
            StringBuilder domain = new StringBuilder();

            // for local
            for (int i = 0; i < e.length(); i++) {
                // If + in the local , everything behond + will be ignored
                // also at @ since after @ , those character will be domain
                if (e.charAt(i) == '+' || e.charAt(i) == '@') break;
                // igrone the '.'
                if (e.charAt(i) != '.') local.append(e.charAt(i));
            }

            // for domain
            for (int i = e.length() - 1; i >= 0; i--) {
                domain.append(e.charAt(i));
                if (e.charAt(i) == '@') break;
            }

            domain = domain.reverse();
            local.append(domain);
            set.add(local.toString());
        }
        return set.size();
    }
}
