import java.util.Arrays;

public class Fish {
    public int solution(int[] A, int[] B) {
        int remainingFishes = 0;

        if (A.length == 0 || B.length == 0) {
            return 0;
        }

        int[] c = new int[A.length];
        int[] d = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            if (B[i] == 1) {
                c[i] = A[i];
            } else {
                d[i] = A[i];
            }
        }

        Arrays.sort(c);
        Arrays.sort(d);
        for (int i = 0; i < A.length; i++) {
            if (c.length > 0 && d.length > 0) {
                //if  (c[i])
            } else {
                break;
            }
        }

        return remainingFishes;
    }
}
