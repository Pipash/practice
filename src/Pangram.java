import java.util.HashMap;

public class Pangram {
    public String isItPangram(String str) {
        HashMap<Character, Integer> alphabets = new HashMap<>();
        for (int i = 97; i<= 122; i++) {
            alphabets.put((char) i, i);
        }
        str = str.toLowerCase();
        for (int i = 0; i< str.length(); i++) {
            //System.out.println(str.charAt(i));
            if (alphabets.get(str.charAt(i)) != null) {
                alphabets.remove(str.charAt(i));
            }
        }

        if (alphabets.isEmpty()) {
            return "pangram";
        }
        return "not pangram";
    }
}
