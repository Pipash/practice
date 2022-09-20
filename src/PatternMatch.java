import java.util.ArrayList;

public class PatternMatch {
    int binaryPatternMatching(String pattern, String s) {
        String[] patternArray = pattern.split("");
        float i = (float)s.length()/(float)pattern.length();
        int number = s.length()/pattern.length();
        if (number < i) {
            number += 1;
        }

        ArrayList<String> vowels = new ArrayList<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        vowels.add("y");

        int matched = 0;
        int startPoint = 0;
        /*for (int j = 0; j < number; j++) {
            if (startPoint < (s.length() - pattern.length())) {
                String[] part = s.substring(startPoint, pattern.length()).split("");
            } else {
                String[] part = s.substring(startPoint).split("");
            }

            startPoint += number;
            //System.out.println(startPoint);
            boolean val = true;
            for (int k = 0; k < pattern.length(); k++) {
                if ((patternArray[k].equals("0") && vowels.contains(part[k])) || (patternArray[k].equals("1") && !vowels.contains(part[k]))) {
                    val = true;
                } else {
                    val = false;
                }
            }
            if (val) {
                matched++;
            }
        }*/

        System.out.println(matched);

        return 0;
    }
}
