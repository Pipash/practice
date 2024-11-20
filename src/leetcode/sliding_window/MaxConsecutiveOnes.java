package src.leetcode.sliding_window;

public class MaxConsecutiveOnes {
    // the idea is to count zeros till the constraint and if the condition broken
    // then move left bound one by one until the constraint condition is true which is
    // if we found zero in our left boundary moving then count zero minus
    // again if condition is true then move right bound forward and go on this way
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;

        int zeroCount = 0;
        int ans = 0, left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k){
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            ans = Math.max(ans, right-left+1);
        }

        System.out.println(ans);
    }
}
