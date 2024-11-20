package src.leetcode.prefix_sum;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int length = nums.length;
        int[] runningSum = new int[length];

        // prefix sum first element is always first element of given array
        runningSum[0] = nums[0];
        for (int i = 1; i < length; i++) {
            runningSum[i] = runningSum[i-1]+nums[i];
        }

        System.out.println(Arrays.toString(runningSum));
    }
}
