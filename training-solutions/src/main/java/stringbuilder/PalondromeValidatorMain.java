package stringbuilder;

public class PalondromeValidatorMain {

    public static void main(String[] args) {
        PalondromeValidator pv = new PalondromeValidator();

        String test1 = "palondrome";
        String test2 = "iSPaLiNdRoMeEmOrDnIlApsI";
        System.out.println(test1 + " is palindrome? "+ pv.isPalindrome(test1));
        System.out.println(test2 + " is palindrome? "+ pv.isPalindrome(test2));
    }
}
