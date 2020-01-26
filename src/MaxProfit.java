public class MaxProfit {
    public int solution(int[] A) {
        int maxProfit = 0;
        int n = A.length;
        if (n == 0) {
            return maxProfit;
        }

        int maxValue, minValue, maxValuePosition, minValuePosition;
        maxValue = maxValuePosition = 0;
        minValue = A[n-1];
        minValuePosition = n-1;

        for (int i = n-1; i >= 0; i--) {
            if (A[i] > maxValue) {
                maxValue = A[i];
                maxValuePosition = i;
            }

            if (A[i] < minValue) {
                minValue = A[i];
                minValuePosition = i;
            }
        }

        maxProfit = A[maxValuePosition] - A[minValuePosition];

        return maxProfit;
    }
}
