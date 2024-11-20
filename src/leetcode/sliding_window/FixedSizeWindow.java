package src.leetcode.sliding_window;

public class FixedSizeWindow {
    public static void main(String[] args) {
        int[] nums = {5};
        int k =1;
        if (nums.length == 1) {
            System.out.println(nums[0]/1.0);
            return;
        }
        Double max_avg, sum = 0.0;;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max_avg =  sum/k;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i-k];
            max_avg = Double.max(max_avg, sum/k);
        }

        System.out.println(max_avg);
    }
}
