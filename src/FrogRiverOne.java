import java.util.ArrayList;
import java.util.HashMap;

public class FrogRiverOne {
    public int earliestTime(int X, int[] A) {
        int time = -1;
        if (A.length == 0) {
            return time;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        ArrayList<Integer> number = new ArrayList<>();
        int j =1;
        for (int i = 0; i < A.length; i++) {
            if (!hashMap.containsKey(A[i])) {
                hashMap.put(A[i], i);
            }
            if(hashMap1.containsKey(A[i])) {
                hashMap1.put(A[i], A[i] + 1);
            } else {
                hashMap1.put(A[i], 1);
                number.add(j);
                j++;
            }
        }
        //System.out.println(number);
        for (int i = 0; i < number.size(); i++) {
            if (!hashMap1.containsKey(number.get(i))) {
                return time;
            }
        }

        if (hashMap.containsKey(X) && hashMap1.get(X) == 1) {
            time = hashMap.get(X);
        }

        return time;
    }
}
