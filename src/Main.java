import string.*;

public class Main {
    public static void main(String[] args) {

        /* 1. StringInterleaver
        //define the object
        StringInterleaver merge = new StringInterleaver();
        //pass the first two args to 'alternateCharacters'
        String result = merge.alternateCharacters(args[0], args[1]);
        //print the result
        System.out.println("The result is" + result);
         */

        //define the object
        Alphabet alphabet = new Alphabet();
        //pass the first args to 'countVowel'
        String myString = args[0];
        myString = myString.toLowerCase();
        String result = alphabet.countVowel(myString);
        //print the result
        System.out.println(result);

    }
}