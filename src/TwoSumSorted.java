import java.util.Arrays;

public class TwoSumSorted {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 4, 6, 8, 9, 14, 15};
        int i = 0;
        int j = nums.length -1;
        while (i < j) {
            if (nums[i] + nums[j] == 13) {
                System.out.println(nums[i] +" + "+nums[j]);
                break;
            } else if (nums[i] + nums[j] > 13){
                j--;
            } else if (nums[i] + nums[j] < 13) {
                i++;
            }
        }
        //System.out.println(nums[i]);
    }
}
