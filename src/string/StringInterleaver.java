package string;

public class StringInterleaver {
    public String alternateCharacters(String a, String b){
        StringBuilder result = new StringBuilder();  // Initiate result
        for(int i = 0; i < Math.min(a.length(), b.length()); i++){
            result.append(a.charAt(i));  // append the value of a to result
            result.append(b.charAt(i)); // append the value of b to result
        }
        //find the longest string and add the extra chars to the result
        String extra = a.length() > b.length() ? a.substring(b.length()) : b.substring(a.length());
        result.append(extra);
        return result.toString(); // convert the result to String
    }
}
