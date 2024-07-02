package src.leetcode.prefix_sum;

import java.util.Arrays;

public class PrefixSumFirst {
    public static void main(String[] args) {
        int[] nums = {1, 6, 3, 2, 7, 2};
        int[][] queries = {{0, 3}, {2, 5}, {2, 4}};
        int[] prefixSum = new int[nums.length];

        boolean[] queryResult = new boolean[queries.length];

        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        for (int i = 0; i < queries.length; i++) {
            int result = prefixSum[queries[i][1]] - prefixSum[queries[i][0]] + nums[queries[i][0]];
            queryResult[i] = false;
            if (result <= 13){
                queryResult[i] = true;
            }
        }

        System.out.println(Arrays.toString(queryResult));
    }
}
