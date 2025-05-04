package src.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

public class PangramCheck {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        Set<Character> strSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            strSet.add(str.charAt(i));
        }

        String print = "true";
        char alphabet = 'a';
        while (alphabet <= 'z') {
            if (!strSet.contains(alphabet)){
                print = "false";
                break;
            }

            alphabet++;
        }

        System.out.println(print);
    }
}
