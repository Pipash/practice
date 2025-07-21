package src.leetcode.hashmap;

import java.util.*;

public class CommonSortedIntArr {
    public static void main(String[] args) {
        int[][] intArray = {{3,1,2,4,5}, {1,2,3,4}, {3,4,5,6}};

        Map<Integer, Integer> arrNumCount = new HashMap<>();

        for (int[] ints : intArray) {
            for (int i : ints) {
                arrNumCount.put(i, arrNumCount.getOrDefault(i, 0) + 1);
            }
        }

        int len = intArray.length;
        List<Integer> answer = new ArrayList<>();
        for (int key : arrNumCount.keySet()) {
            if (arrNumCount.get(key) == len) {
                answer.add(key);
            }
        }

        Collections.sort(answer);

        System.out.println(answer);
    }
}
