import string.StringInterleaver;

public class Main {
    public static void main(String[] args) {
        //define the object
        StringInterleaver merge = new StringInterleaver();
        //pass the first two args to 'alternateCharacters'
        String result = merge.alternateCharacters(args[0], args[1]);
        //print the result
        System.out.println("The result is" + result);

    }
}