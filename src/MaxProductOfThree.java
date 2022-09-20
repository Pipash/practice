import java.util.Arrays;

public class MaxProductOfThree {
    public int maxTripletProduct(int[] A) {
        int maxValue = 0;
        if(A.length == 0) {
            return maxValue;
        }
        Arrays.sort(A);
        //System.out.println(Arrays.toString(A));
        int maxIndex = A.length;
        maxValue = A[maxIndex-1]*A[maxIndex-2]*A[maxIndex-3];

        return maxValue;
    }
}
