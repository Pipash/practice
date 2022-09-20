public class ClosestSum {
    public ClosestSum() {
        int[] arr = {10, 22, 28, 29, 30, 40};
        int sum = 54;
        int minL = 0, minR = 0;
        int l = 0, r = arr.length - 1, diff = Integer.MAX_VALUE;

        while (r>l) {
            if (Math.abs(arr[l]+arr[r] - sum) < diff) {
                diff = Math.abs(arr[l]+arr[r] - sum);
                minL = l; minR = r;
            } else if(arr[l] + arr[r] < sum) {
                l++;
            } else {
                r--;
            }
        }

        System.out.printf("%d, %d",arr[minL], arr[minR]);
    }
}
