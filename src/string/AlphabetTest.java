package string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlphabetTest {

    @Test
    public void testCountVowel() {
        Alphabet alphabet = new Alphabet();
        String result = alphabet.countVowel("hello");
        assertEquals("Number of vowels: 2", result);
    }

    @Test
    public void testCountConsonant() {
        Alphabet alphabet = new Alphabet();
        String result = alphabet.countConsonants("hello");
        assertEquals("Number of consonants: 3", result);
    }

    @Test
    public void testEmpty() {
        Alphabet alphabet = new Alphabet();
        String result = alphabet.countVowel("");
        assertEquals("Number of vowels: 0", result);
    }


    @Test
    public void testAlternateCharacters() {
        StringInterleaver interleaver = new StringInterleaver();
        String result = interleaver.alternateCharacters("aceg", "bdfh");
        assertEquals("abcdefgh", result);
    }
}
