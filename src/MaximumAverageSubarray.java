public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] nums = {-1, -2};
        int k = 1, curr = 0;
        double ans = 0.00, avg = 0.00;
        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                curr -= nums[i-k];
            }
            curr += nums[i];
            if (i>= k-1) {
                avg = (double) curr/k;
            }
            ans = Math.max(ans,avg);
        }

        System.out.println(ans);
    }
}
