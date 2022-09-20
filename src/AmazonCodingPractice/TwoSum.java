package AmazonCodingPractice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public TwoSum() {
        int[] nums = {2,7,11,15};
        int[] arr = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            map.put(nums[j], j);
            arr[j] = nums[j];
        }
        int target = 9;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(nums));
        //System.out.println(Arrays.toString(arr));
        int[] arrayValue = new int[2];

        int i = 0;
        int len = (arr.length - 1);
        while (i <= len) {
            if (i == len) {
                System.out.println("nothing found");
                break;
            }
            if (arr[i] + arr[len] == target) {
                arrayValue[0] = arr[i];
                arrayValue[1] = arr[len];
                break;
            } else if (arr[i] + arr[len] > target) {
                len--;
            } else {
                i++;
            }
        }

        if (arrayValue[0] > 0) {
            System.out.printf("[%d, %d]", map.get(arrayValue[0]), map.get(arrayValue[1]));
        }

    }
}
