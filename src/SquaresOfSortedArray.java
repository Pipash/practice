import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int i = 0;
        int j = nums.length -1;
        while (i<=j) {
            nums[i] = nums[i] * nums[i];
            if (i<j) {
                nums[j] = nums[j] * nums[j];
            }
            i++;
            j--;
        }
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}
