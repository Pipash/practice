import java.util.ArrayList;

public class FlagsOnPick {
    public int flag(int[] A) {
        int flag = 0;
        int length = A.length;
        if (length ==0) {
            return 0;
        }

        int i = 1;
        ArrayList<Integer> picks = new ArrayList<>();
        while (i < length - 1){
            if (A[i-1] < A[i] && A[i] > A[i+1]) {
                picks.add(i);
                i += 2;
            } else {
                i++;
            }
        }
        int pickSize = picks.size();
        if (pickSize == 0) {
            return 0;
        }
        if (pickSize == 1) {
            return 1;
        }
        for (i=0; i < pickSize; i++) {
            int diff = picks.get(i) + pickSize;
            //System.out.println(diff);
            for (int j = i+1; j < pickSize; j++) {
                //System.out.println(picks.get(j));
                if (picks.get(j) >= diff) {
                    flag += 1;
                    break;
                }
            }
            //System.out.println();
            /*if (Math.abs(diff) >= pickSize) {
                flag +=1;
            }*/
        }

        return  flag;
    }
}
