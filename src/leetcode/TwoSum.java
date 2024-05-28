package src.leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        /*int[] nums = {2,7,11,15};
        int target = 9;*/

        int[] nums = {3,2,4};
        int target = 6;

        Arrays.sort(nums);
        
        int start = 0;
        int length = nums.length;
        int end = length - 1;

        while (start < end) {
            int twoSum = nums[start] + nums[end];
            System.out.println(start);
            System.out.println(end);
            System.out.println(twoSum);
            System.out.println();
            if (twoSum == target) {
                System.out.println("[" + start + "," + end + "]");
                break;
            } else if (twoSum > target) {
                end--;
            } else {
                start++;
            }
        }
    }
}
