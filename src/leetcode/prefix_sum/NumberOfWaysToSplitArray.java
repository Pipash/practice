package src.leetcode.prefix_sum;

public class NumberOfWaysToSplitArray {
    public static void main(String[] args) {
        int[] nums = {10,4,-8,7};
        int length = nums.length;

        // first solution
        //with prefixSum array
        int[] prefixSum = new int[length];
        int splitArrays = 0;
        // prefix sum first index always first index of num
        prefixSum[0] = nums[0];

        //making the prefix sum
        for (int i = 1; i < length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        // if left bound is greater than right bound of the split array then count that
        for (int i = 0; i < length - 1; i++) {
            int leftBound = prefixSum[i];
            int rightBound = prefixSum[length-1]-prefixSum[i];
            if (leftBound >= rightBound){
                splitArrays++;
            }
        }

        // second solution
        // without prefixSum array to reduce space complexity
        splitArrays = 0;
        int totalSumOfArray = 0;
        for (int i = 0; i < length; i++) {
            totalSumOfArray += nums[i];
        }

        int lefBound = 0;
        for (int i = 0; i < length - 1; i++) {
            lefBound += nums[i];
            int rightBound = totalSumOfArray - lefBound;

            if (lefBound >= rightBound) {
                splitArrays++;
            }
        }

        System.out.println(splitArrays);
    }
}
