package string;

public class Alphabet {
    public String countVowel(String s) {
        int vow = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("aeiou".indexOf(s.charAt(i)) > -1) {
                vow++;
            }
        }
        return "Number of vowels: " + vow;
    }

    public String countConsonants(String s) {
        int consonant = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("bcdfghjklmnpqrstvwxyz".indexOf(s.charAt(i)) > -1) {
                consonant++;
            }
        }
        return "Number of consonants: " + consonant;
    }
}
