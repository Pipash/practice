import java.util.HashMap;

public class LinkedList {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int indexOfMinusOne = 0;
        HashMap<Integer, Integer> reverseArray = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            reverseArray.put(A[i], i);
            if (A[i] == -1) {
                indexOfMinusOne = i;
            }
        }

        return reverseArray.get(indexOfMinusOne);
    }
}
