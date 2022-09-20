import java.util.HashMap;

public class SeatReservation {
    public int solution(int N, String S) {
        // write your code in Java SE 8
        String[] split = S.split(" ");
        HashMap<String, String> reverseArray = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            reverseArray.put(split[i], "booked");
        }
        int numberOfBookedFamily = 0;
        for (int i = 1; i <= N; i++) {
            if (!reverseArray.containsKey(i+"B") && !reverseArray.containsKey(i+"C") && !reverseArray.containsKey(i+"D") && !reverseArray.containsKey(i+"E")) {
                numberOfBookedFamily += 1;
                reverseArray.put(i+"B", "booked");
                reverseArray.put(i+"C", "booked");
                reverseArray.put(i+"D", "booked");
                reverseArray.put(i+"E", "booked");
            }

            if (!reverseArray.containsKey(i+"D") && !reverseArray.containsKey(i+"E") && !reverseArray.containsKey(i+"F") && !reverseArray.containsKey(i+"G")) {
                numberOfBookedFamily += 1;
                reverseArray.put(i+"D", "booked");
                reverseArray.put(i+"E", "booked");
                reverseArray.put(i+"F", "booked");
                reverseArray.put(i+"G", "booked");
            }

            if (!reverseArray.containsKey(i+"F") && !reverseArray.containsKey(i+"G") && !reverseArray.containsKey(i+"H") && !reverseArray.containsKey(i+"J")) {
                numberOfBookedFamily += 1;
                reverseArray.put(i+"F", "booked");
                reverseArray.put(i+"G", "booked");
                reverseArray.put(i+"H", "booked");
                reverseArray.put(i+"J", "booked");
            }
        }

        return numberOfBookedFamily;
    }
}
