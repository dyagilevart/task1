package Task;

public class BetterProgrammerTask {

    public static boolean isPalindrome(String s) {
        /*
          Definition: A palindrome is a string that reads the same forward and backward.
          For example, "abcba" is a palindrome, "abab" is not.
          Please implement this method to
          return true if the parameter is a palindrome and false otherwise.
         */
        String reverse_s = new String();
        for (int i = s.length() - 1; i >= 0; --i){
            reverse_s += s.charAt(i);
        }
        return reverse_s.equals(s);
    }
}
