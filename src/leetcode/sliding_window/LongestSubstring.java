package src.leetcode.sliding_window;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "1101100111";
        int count = 0, left = 0, result = 0, constraint = 1;

        for (int right = 0; right < s.length(); right++) {
            if(s.charAt(right) == '0') {
                count++;
            }

            while (count > constraint) {
                if (s.charAt(left) == '0') {
                    count--;
                }
                left++;
            }

            result = Math.max(result, right - left +1);
        }

        System.out.println(result);
    }

}
