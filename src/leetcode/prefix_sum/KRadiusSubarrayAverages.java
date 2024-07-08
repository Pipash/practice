package src.leetcode.prefix_sum;

import java.util.Arrays;

public class KRadiusSubarrayAverages {
    public static void main(String[] args) {
        int[] nums = {7,4,3,9,1,8,5,2,6};
        int k = 3;
        int length = nums.length;
        //System.out.println(length);
        int constraint = 2*k+1;
        //System.out.println(constraint);
        long[] avgArray = new long[length];

        /* Arrays.fill(avgArray, -1);
         if (length < constraint) {
             return avgArray;
         }*/

        if (length < constraint) {
            for (int i = 0; i < length; i++) {
                avgArray[i] = -1;
            }
            System.out.println(Arrays.toString(avgArray));
            System.exit(200);
        } else {
            for (int i = 0; i < k; i++) {
                avgArray[i] = -1;
                avgArray[length-i-1] = -1;
            }
        }

        long sum = 0;
        for (int i = 0; i < constraint; i++) {
            sum += nums[i];
        }
        int position = k;
        avgArray[position] = (int) (sum/constraint);
        //System.out.println(sum+"/"+constraint+"="+position+" "+ avgArray[position]);

        for (int i = constraint; i < length; i++) {
            sum += nums[i] - nums[i-constraint];
            position++;
            avgArray[position] = (int) (sum/constraint);
        }

        System.out.println(Arrays.toString(avgArray));
    }
}
