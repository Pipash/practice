import java.util.Arrays;

public class MergeSort {
    public MergeSort() {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int length = arr.length;
        sort(arr, 0, length -1);
        System.out.println(Arrays.toString(arr));
    }

    public void sort (int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low +high)/2;

            sort(arr, low, mid);
            sort(arr, mid +1, high);
            merge(arr, low, mid, high);
        }
    }

    public void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /*Copy data to temp arrays*/
        //System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr, l + 0, L, 0, n1);
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
