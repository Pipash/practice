import java.util.Arrays;
import java.util.HashMap;

public class Dominator {
    public int solution(int[] A) {
        int dominatorPosition = -1;
        if (A.length == 0) {
            return dominatorPosition;
        }
        int n = A.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hashMap.put(A[i], i);
        }
        Arrays.sort(A);
        int position = (int) Math.ceil(n/2.0);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == A[position]) {
                count++;
            }
        }

        if (count > n/2) {
            dominatorPosition = hashMap.get(A[position]);
        }

        return dominatorPosition;
    }
}
