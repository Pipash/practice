import java.util.Arrays;

public class Triangle {
    public int findTriplet(int[] A) {
        int foundTriplet = 0;
        if (A.length == 0) {
            return foundTriplet;
        }
        Arrays.sort(A);

        for (int i = 0; i < A.length-2; i++) {
            if ((A[i] + A[i+1]) > A[i+2]) {
                foundTriplet = 1;
                break;
            }
        }

        return foundTriplet;
    }
}
