package AmazonCodingPractice;

import java.util.HashMap;
import java.util.Map;

public class Pallindrom {
    public static int minSwapsRequired(String s) {
        // Write your code here
        HashMap<Character, Integer> map = new HashMap<>();
        for(char chr : s.toCharArray()) {
            if (map.containsKey(chr)) {
                map.put(chr, map.get(chr) + 1);
            } else {
                map.put(chr, 1);
            }
        }

        int odds = 0;
        StringBuilder oddChar = new StringBuilder();
        for (Map.Entry<Character, Integer> each : map.entrySet()) {
            if (each.getValue() % 2 != 0) {
                odds++;
                oddChar.append(each.getKey());
            }
        }
        if (odds >= 1 && s.length() % 2 == 0) {
            return -1;
        }

        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int steps = 0;

        for (Map.Entry<Character, Integer> each :
                map.entrySet()) {
            for (int i = 0; i < each.getValue() / 2; i++) {
                str.append(each.getKey());
            }

            str1.append(str);
            str2.insert(0, str);
            steps++;
        }

        StringBuilder s1 = str1.append(oddChar).append(str2);

        return steps;
    }
}
