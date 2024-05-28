package src.leetcode.two_pointer;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        //int[] nums = {-7,-3,2,3,11};
        //int[] nums = {-5,-3,-2,-1};
        int i = 0;
        int j = nums.length - 1;
        int len = j;

        int[] result = new int[nums.length];

        // square of ith and jth position
        int ith = nums[i] * nums[i];
        int jth = nums[j] * nums[j];

        //continue the loop until i less than j
        while (i < j) {
            //System.out.println(i+": "+ith+" "+j+": "+jth);
            // when ith square less than jth square then put jth into result and decrease jth by 1
            if (ith < jth) {
                result[len] = jth;
                j--;
                // generate new jth
                jth = nums[j] * nums[j];
            } else {
                // when ith greater than jth square then put ith into result and increase ith by 1
                result[len] = ith;
                i++;
                // generate new ith
                ith = nums[i] * nums[i];
            }
            len--;
        }

        if (i == j) {
            result[len] = ith;
        }

        System.out.println(Arrays.toString(result));
    }
}
