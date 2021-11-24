package recursion;

public class Palindrome {

    public boolean isPalindrome(String word) {
        if (word.length() > 1) {
            if (word.charAt(0) != word.charAt(word.length() - 1)) {
                return false;
            } else {
                String next = word.substring(1, word.length() - 1);
                return isPalindrome(next);
            }
        }
        return true;
    }
}

