package AmazonCodingPractice;

import java.util.Arrays;
import java.util.HashMap;

public class MaxUnitOnTruck {
    public MaxUnitOnTruck() {
        int[][] arr = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        int truckSize = 10;

        int[] units = new int[arr.length];
        HashMap<Integer, Integer> unitBoxes = new HashMap<>();

        int k = 0;
        int length = 0;
        for (int[] ints : arr) {
            units[k] = ints[1];
            unitBoxes.put(ints[1], ints[0]);
            length++;
            k++;
        }
        sort(units, 0, length - 1);
        System.out.println(Arrays.toString(units));
        System.out.println(unitBoxes);
        int numberOfBoxes = 0;
        int totalUnits = 0;
        int leftBox = 0;
        for (int i = (units.length - 1); i >= 0; i--) {
            if (numberOfBoxes <= truckSize) {
                //leftBox = truckSize - leftBox;
                System.out.printf("%d, %d, %d, %d \n", numberOfBoxes, units[i], unitBoxes.get(units[i]), leftBox);
                if ((truckSize - leftBox) > unitBoxes.get(units[i])) {
                    totalUnits += units[i] * unitBoxes.get(units[i]);
                    leftBox += unitBoxes.get(units[i]);
                } else if ((truckSize - leftBox) < unitBoxes.get(units[i])){
                    totalUnits += units[i] * leftBox;
                }
                numberOfBoxes += unitBoxes.get(units[i]);
            }
        }
        System.out.println();
        System.out.println(totalUnits);
    }

    private void sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }

    }

    private void merge(int[] arr, int low, int mid, int high) {
        // size of two new array
        int n1 = mid - low + 1;
        int n2 = high - mid;

        // init 3 new array
        int[] arrL = new int[n1];
        int[] arrH = new int[n2];
        System.arraycopy(arr, low, arrL, 0, n1);
        System.arraycopy(arr, mid + 1, arrH, 0, n2);
        int i = 0, j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (arrL[i] <= arrH[j]) {
                arr[k] = arrL[i];
                i++;
            } else {
                arr[k] = arrH[j];
                j++;
            }
            k++;
        }

        // left low array value to be added
        while (i < n1) {
            arr[k] = arrL[i];
            i++;
            k++;
        }

        //left high array value to be added
        while (j < n2) {
            arr[k] = arrH[j];
            j++;
            k++;
        }
    }
}
