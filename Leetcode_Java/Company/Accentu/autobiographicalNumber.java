package Leetcode_Java.Company.Accentu;


/*
public static int findAutoCount(String n) {
        int sum = 0;

        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(n.charAt(i) + "");
        }

        if (sum == n.length()) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n.length(); i++) {
                int digit = Integer.parseInt(n.charAt(i) + "");
                map.put(digit, map.getOrDefault(digit, 0) + 1);
            }

            int count = 0;
            for (int value : map.values()) {
                if (value != 0) {
                    count++;
                }
            }

            return count;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(findAutoCount(str));
    }
 */






/*
    Given N as the number of digits, the task is to find all the Autobiographical Numbers whose
    length is equal to N.

    If it is , an integer is returned , which represents the count of distinct  numbers in
    'n'. If not, return 0

    Example:
    Input : 1210
    Output: 3
. */



//https://www.youtube.com/watch?v=BbWRu0B1Oak&list=PLKtofb3HgEyyVYpMYF4mT5Ha7zR4nfRuO&index=2
public class autobiographicalNumber {

    public static int findAutoCount(String n) {
        return 0;
    }
}




