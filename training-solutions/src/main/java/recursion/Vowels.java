package recursion;

public class Vowels {

    public int getNumberOfVowels(String word) {
        if (word.length() > 0) {
            if (word.length() > 1) {
                return (isVowel(word.charAt(0)) ? 1 : 0) + getNumberOfVowels(word.substring(1));
            } else {
                return isVowel(word.charAt(0)) ? 1 : 0;
            }
        } else {
            return 0;
        }
    }

    private boolean isVowel(char c) {
        final String listOfVowels = "aáeéiíoóöőuúüű";
        return listOfVowels.contains(Character.toString(c));
    }
}
