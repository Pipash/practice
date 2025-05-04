package src.leetcode.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        Set<Integer> numSet = new HashSet<>();
        int count = 0;

        for (int num: arr) {
            numSet.add(num);
        }

        for (int n : arr) {
            if (numSet.contains(n + 1)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
