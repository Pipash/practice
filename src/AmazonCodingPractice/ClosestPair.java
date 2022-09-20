package AmazonCodingPractice;

public class ClosestPair {
    public ClosestPair() {
        int[] arr = {1, 4, 5, 7};
        int[] arr2 = {10, 20, 30, 40};
        int[] newArr = new int[arr.length + arr2.length];
        int sum = 32;
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.arraycopy(arr2, 0, newArr, arr.length, arr2.length);

    }

    public void sort(int[] arr, int low, int high) {

    }

    public void merge(int[] arr, int l, int h, int m) {

    }
}
