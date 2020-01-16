import java.util.ArrayList;
import java.util.Collections;

public class Fish {
    public int solution(int[] A, int[] B) {
        int remainingFishes = 0;

        if (A.length == 0 || B.length == 0) {
            return 0;
        }

        if (A.length == 1) {
            return 1;
        }

        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();

        for (int i = 0; i < B.length; i++) {
            if (B[i] == 1) {
                c.add(A[i]);
            } else {
                d.add(A[i]);
            }
        }

        Collections.sort(c);
        Collections.sort(d);
        int size = 0;
        if (c.size() > d.size()) {
            size = c.size();
        } else {
            size = d.size();
        }
        for (int i = 0; i < size; i++) {
            if (c.size() > 0 && d.size() > 0) {
                if  (c.get(0) > d.get(0)) {
                    d.remove(0);
                } else {
                    c.remove(0);
                }
            } else {
                if (c.size() > 0) {
                    remainingFishes = c.size();
                } else if (d.size() > 0) {
                    remainingFishes = d.size();
                }
                break;
            }
        }

        return remainingFishes;
    }
}
