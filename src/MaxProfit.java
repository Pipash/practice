public class MaxProfit {
    public int solution(int[] A) {
        int maxProfit = 0;
        int n = A.length;
        if (n == 0) {
            return maxProfit;
        }

        int maxValue, minValue, maxValuePosition, minValuePosition;
        // maxValue = maxValuePosition = 0;
        maxValue = A[n-1]; maxValuePosition = n-1;
        minValue = A[n-1]; minValuePosition = n-1;

        for (int i = n-1; i >= 0; i--) {
            if (A[i] > maxValue) {
                maxValue = minValue= A[i];
                maxValuePosition = minValuePosition= i;
                //System.out.println(maxValuePosition);
            }

            if (A[i] < minValue) {
                minValue = A[i];
                minValuePosition = i;
            }

            int profit = maxValue - minValue;
            if (profit > maxProfit) {
                maxProfit = profit;
            }

            //System.out.println(minValuePosition);
        }
        //System.out.println(maxValuePosition);
        //System.out.println(minValuePosition);
        //maxProfit = maxValue - minValue;

        return maxProfit;
    }
}
