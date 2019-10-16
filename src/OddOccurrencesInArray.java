import java.util.HashMap;
import java.util.Map;

class OddOccurrencesInArray {
    public Integer OddOccurrenc () {
        Integer[] A = {9, 3, 9, 3, 9, 7, 9};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer number: A) {
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }
        Integer oddNumber = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() == 1) {
                oddNumber = entry.getKey();
            }
        }

        return oddNumber;
    }
}
