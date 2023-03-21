import java.util.HashMap;
import java.util.Map;

public class SlidingWindow1 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        int curr = 0;
        int left = 0;
        int ans = 0;
        int k = 8;
        /*Map<String, Integer> bound = new HashMap<>();
        Map<Integer, Map<String, Integer>> subArray = new HashMap<>();*/
        for (int right = 0; right < nums.length; right++) {
            curr += nums[right];
            while (curr > k) {
                curr -= nums[left];
                left++;
            }
            ans = Math.max(ans, right - left +1);
            /*if (!subArray.containsKey(ans)) {
                bound.put("left", left);
                bound.put("right", right);
                subArray.put(ans, bound);
            }*/

            System.out.println(curr + " " + left+" "+right +" "+ans);
        }

        /*left = subArray.get(ans).get("left");
        int right = subArray.get(ans).get("right");
        while (left <= right) {
            System.out.print(nums[left]+" ");
            left++;
        }
        System.out.println();
        System.out.println(nums[subArray.get(ans).get("left")]+" "+ nums[subArray.get(ans).get("right")]);*/
    }
}
