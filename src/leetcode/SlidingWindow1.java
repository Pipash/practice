package src.leetcode;

public class SlidingWindow1 {
    public static void main(String[] args) {
        Integer[] array = {2,3,5,2,9,7,1}; //10,10, 16, 18, 17
        int max = 0;
        int sum = 0;
        int n = 3;
        for (int i = 0; i< array.length; i++) {
            // 1. sum the first nth number
            // here n is 3 so sum the number till i is 3
            if (i < n) {
                sum += array[i];
                max = sum;
            } else {
                // 2. when the ith position is above first nth position then
                // since the first nth position sum already are there then just add the
                // new ith number and minus the first number of previous nth sum.
                // Here when i position is greater than nth which is 3 then
                // add the 4th position and minus the 0th position then new nth sum will be found
                // and repeat the same thing again for the next n item
                sum += array[i] - array[i-n];

                if (sum > max) {
                    max = sum;
                }
            }
        }

        sum = 0;
        max = Integer.MIN_VALUE;
        int j = 0, i = 0;
        while (j < array.length) {
            sum += array[j];
            if (j - i +1 < n) {

            }
        }

        System.out.println(max);
    }
}
