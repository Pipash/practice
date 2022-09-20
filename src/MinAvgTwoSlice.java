import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MinAvgTwoSlice {
    public int minAvg(int[] A) {
        int avg = 0;
        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                p.add(A[0]);
                continue;
            }

            p.add(p.get(i-1) + A[i]);
        }

        HashMap<Integer, Integer> slices = new HashMap<>();
        slices.put(1,2);
        slices.put(3,4);
        slices.put(1,4);
        Iterator slIterator = slices.entrySet().iterator();
        int i = 0;
        int minPosition = 0;
        System.out.println(slices);
        while (slIterator.hasNext()) {
            Map.Entry elem = (Map.Entry)slIterator.next();
            int up = (int) elem.getValue();
            int down = (int) elem.getKey();
            System.out.println(up+" "+down);
            /*if (i == 0) {
                i++;
                avg = (p.get(up) - p.get(down - 1)) / (up - down + 1);
                System.out.println(avg);
                continue;
            }
            int j = (p.get(up) - p.get(down - 1)) / (up - down + 1);
            if (avg > j) {
                avg = j;
            }
            System.out.println(avg);*/
            i++;

        }
        //System.out.println(p);

        return avg;
    }
}
