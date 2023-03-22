package WindowProblems;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3, ans = 0, left = 0, count = 0;
        for (int right = 0; right < nums.length; right++) {
            // count zero when encounter at current position
            if (nums[right] == 0) {
                count++;
            }

            //since zero can be flipped up to the constraint k if zero count is greater than constraint k
            // then decrease count if left position found zero until zero count less than constraint
            // increase left side to start a new window
            while (count > k) {
                if (nums[left] == 0) {
                    count--;
                }
                left++;
            }

            //get the length of the window
            ans = Math.max(ans, right - left + 1);
        }

        System.out.println(ans);
    }
}
