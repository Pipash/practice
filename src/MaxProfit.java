public class MaxProfit {
    public int solution(int[] A) {
        int maxProfit = 0;
        int n = A.length;
        if (n == 0) {
            return maxProfit;
        }

        int maxValue, minValue, maxValuePosition, minValuePosition;
        // maxValue = maxValuePosition = 0;
        maxValue = minValue = A[n-1];
        maxValuePosition = minValuePosition = n-1;

        for (int i = n-1; i >= 0; i--) {
            if (A[i] > maxValue && maxValuePosition >= minValuePosition) {
                maxValue = A[i];
                maxValuePosition = i;
            }

            if (A[i] < minValue && minValuePosition <= maxValuePosition) {
                minValue = A[i];
                minValuePosition = i;
            }
            System.out.println(maxValuePosition);
            System.out.println(minValuePosition);
        }
        System.out.println(maxValuePosition);
        System.out.println(minValuePosition);
        maxProfit = maxValue - minValue;

        return maxProfit;
    }
}
