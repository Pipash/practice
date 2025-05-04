package src.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int len = nums.length;
        Set<Integer> numSet = new HashSet<>();
        for (int n : nums) {
            numSet.add(n);
        }
        /*for (int n : nums) {
            if (!numSet.contains(n)) {
                System.out.println(n);
            }
        }*/

        for (int i = 0; i <= len; i++) {
            if (!numSet.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
