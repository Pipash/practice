import java.util.HashMap;
import java.util.Map;

public class SlidingWindowStringSubArray {
    public static void main(String[] args) {
        String s = "1101100111";
        int left = 0, maxSubArrLen = 0, curr = 0;
        Map<String, Integer> bound = new HashMap<>();
        Map<Integer, Map<String, Integer>> subArray = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '0') {
                curr++;
            }
            while (curr > 1) {
                if (s.charAt(left) == '0') {
                    curr--;
                }
                left++;
            }

            maxSubArrLen = Math.max(maxSubArrLen, right - left + 1);
            if (!subArray.containsKey(maxSubArrLen)) {
                bound.put("left", left);
                bound.put("right", right);
                subArray.put(maxSubArrLen, bound);
            }
        }

        System.out.println(subArray.get(maxSubArrLen));
        System.out.println(maxSubArrLen);
    }
}
