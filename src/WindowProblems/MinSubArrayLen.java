package WindowProblems;

import java.util.Arrays;

public class MinSubArrayLen {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7, left = 0, sum = 0, ans=Integer.MAX_VALUE, foundOne = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                foundOne =1;
                sum -= nums[left];
                ans = Math.min(ans, right-left+1);
                left++;
            }
            //System.out.println(sum+" "+left+" "+ right+" "+ans);
        }
        if (foundOne == 0) {
            ans = 0;
        }

        System.out.println(ans);

        /*int[] nums = {1,1,1,1,1,1,1};
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] == 0) {
                nums[left] = 1;
                while (nums[right] == 0) {
                    right--;
                }
                nums[right] = 0;
                System.out.println(left +" "+ right);
                right--;
            }
            left++;
        }

        System.out.println(Arrays.toString(nums));*/
    }
}
