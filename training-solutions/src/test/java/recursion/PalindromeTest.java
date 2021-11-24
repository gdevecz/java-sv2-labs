package recursion;

import algorithmstransformation.students.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    @Test
    void testIsPalindromeTrue() {
        assertEquals(true, palindrome.isPalindrome(""));
        assertEquals(true, palindrome.isPalindrome("a"));
        assertEquals(true, palindrome.isPalindrome("aa"));
        assertEquals(true, palindrome.isPalindrome("aba"));
        assertEquals(true, palindrome.isPalindrome("abba"));
        assertEquals(true, palindrome.isPalindrome("abcba"));
    }

    @Test
    void testIsPalindromeFalse() {
        assertEquals(false, palindrome.isPalindrome("ax"));
        assertEquals(false, palindrome.isPalindrome("abx"));
        assertEquals(false, palindrome.isPalindrome("xbba"));
        assertEquals(false, palindrome.isPalindrome("abxa"));
        assertEquals(false, palindrome.isPalindrome("axcba"));
    }
}