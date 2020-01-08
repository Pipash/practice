import java.util.HashMap;

public class Distinct {
    public int solution(int[] A) {
        int distinctElements = 0;
        if (A.length == 0) {
            return distinctElements;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>(0);
        for(int i = 0; i < A.length; i++) {
            if(!hashMap.containsKey(A[i])) {
                hashMap.put(A[i], 1);
                distinctElements++;
            }
        }

        return distinctElements;
    }
}
