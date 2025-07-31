package string;

public class Alphabet {
    public String countVowel(String s) {
        int vow = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("aeiou".indexOf(s.charAt(i)) > -1) {
                vow++;
            }
        }
        if (vow == 0) {
            return "There are no vowels in the string.";
        } else if (vow == 1) {
            return "There is 1 vowel in the string.";
        } else {
            return "There are " + vow + " vowels in the string.";
        }
    }
}
