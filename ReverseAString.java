public class ReverseAString {

    /*
    Write a Java program to reverse a given string without using any built-in string reversal functions.
    Example: If the input is "Hello, World!", the output should be "!dlroW ,olleH".
     */

        public static void main (String[] args) {
            String input = "Hello, World!";
            System.out.println(reverse(input));
        }


        //Without using any built-in string reversal functions
        public static String reverse(String n) {
            StringBuilder sb = new StringBuilder();
            for (int i = n.length() - 1; i >= 0; i--) {
                sb.append(n.charAt(i));
            }
            return sb.toString();
        }
}

