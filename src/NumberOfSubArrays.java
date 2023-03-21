public class NumberOfSubArrays {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int left=0, ans=0,curr = 1, constraint = 100;
        for (int right = 0; right < nums.length; right++) {
            curr *= nums[right];
            while (curr >= constraint) {
                curr = curr/nums[left];

                left++;
            }

            ans += right - left +1;
        }

        System.out.println(ans);
    }
}
