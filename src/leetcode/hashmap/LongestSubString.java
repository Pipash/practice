package src.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcabcbb"; //"eceba"
        int k = 2;
        int left = 0, ans = 0;
        Map<Character, Integer> subStr = new HashMap<>();

        for (int right = 0; right < str.length(); right++) {
            subStr.put(str.charAt(right), subStr.getOrDefault(str.charAt(right), 0) + 1);

            while (subStr.size() > k) {
                subStr.put(str.charAt(left), subStr.getOrDefault(str.charAt(left), 0) - 1);
                if (subStr.get(str.charAt(left)) == 0) {
                    subStr.remove(str.charAt(left));
                }
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        System.out.println("longest substring length " + ans);
    }
}
