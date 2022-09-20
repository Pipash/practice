import java.util.ArrayList;
import java.util.HashMap;

public class PermCheck {
    public int check(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        int permutaion = 1;
        HashMap<Integer, Integer> hashedA = new HashMap<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        int j = 1;
        for (int i : A) {
            if (hashedA.containsKey(i)) {
                hashedA.put(i, hashedA.get(i) + 1);
            } else {
                hashedA.put(i, 1);
            }
            numbers.add(j);
            j++;
        }

        for (Integer number : numbers) {
            if (!hashedA.containsKey(number)) {
                permutaion = 0;
                break;
            }
        }

        return permutaion;
    }
}
