package src.leetcode.prefix_sum;

import java.util.Arrays;

public class MinimumValueToGetPositiveStepByStepSum {
    public static void main(String[] args) {
        int[] nums = {-3,2,-3,4,2};
        int constraint = 1;

        int prefixSum = 0;
        int minimumInt = 0;
        for (int item: nums) {
            prefixSum += item;
            minimumInt = Math.min(minimumInt, prefixSum);
        }

        System.out.println(-minimumInt+constraint);
    }
}
