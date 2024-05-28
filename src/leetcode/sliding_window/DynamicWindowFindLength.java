package src.leetcode.sliding_window;

import java.util.HashMap;

public class DynamicWindowFindLength {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        int k = 8;
        int left = 0, currentSum = 0, ans = 0;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            while (currentSum > k) {
                currentSum -= nums[left];
                left++;
            }

            ans = Math.max(ans, right - left +1);
        }

        System.out.println(ans);
        HashMap<Integer, Integer> map = new HashMap<>();

        
    }
}
