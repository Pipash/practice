package WindowProblems;

public class MinSubArrayLen {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7, left = 0, sum = 0, ans=0;
        for (int right = 0; right < nums.length; right++) {
            if (sum <= target) {
                sum += nums[right];
            }

            while (sum > target) {
                sum -= nums[left];
                left++;
            }

            ans = Math.max(ans, right-left+1);
            System.out.println(sum+" "+left+" "+ right+" "+ans);
        }

        System.out.println(ans);
    }
}
