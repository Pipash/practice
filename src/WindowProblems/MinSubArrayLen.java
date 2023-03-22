package WindowProblems;

public class MinSubArrayLen {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7, left = 0, sum = 0, ans=Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                sum -= nums[left];
                ans = Math.min(ans, right-left+1);
                left++;
            }


            //System.out.println(sum+" "+left+" "+ right+" "+ans);
        }

        System.out.println(ans);
    }
}
