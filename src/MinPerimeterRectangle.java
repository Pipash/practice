import java.util.ArrayList;
import java.util.Collections;

public class MinPerimeterRectangle {
    public int perimeter(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 4;
        }
        ArrayList<Integer> perimeters = new ArrayList<>();
        // for i = 1
        perimeters.add(2*(N+1));

        int i = 2;
        while (i*i <= N) {
            if (N % i == 0) {
                int quotient = N / i;
                perimeters.add(2*(quotient + i));
            }

            i++;
        }
        if (!perimeters.isEmpty()) {
            Collections.sort(perimeters);
            return perimeters.get(0);
        }
        //System.out.println(perimeters);

        return 0;
    }
}
