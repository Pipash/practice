import java.util.ArrayList;
import java.util.HashMap;

public class MissingInteger {
    public int missingInt(int[] A) {
        int missingElement = 1;
        if (A.length == 0) {
            return missingElement;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> number = new ArrayList<>();
        int maxInteger = 0;
        boolean found = false;
        int j = 1;
        for (int i : A) {
            if (hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i)+1);
            } else if(i > 0) {
                hashMap.put(i, 1);
                number.add(j);
                if (i > maxInteger) {
                    maxInteger = i;
                }
                j++;
            }
        }
        if (hashMap.size() == 0) {
            return missingElement;
        }
        for (int i = 0; i < number.size(); i++) {
            if (!hashMap.containsKey(number.get(i))) {
                missingElement = number.get(i);
                found = true;
                break;
            }
        }
        if (!found) {
            missingElement = maxInteger + 1;
        }
        //System.out.println(hashMap);
        //System.out.println(number);
        //System.out.println(maxInteger);
        return missingElement;
    }
}
