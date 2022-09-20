import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoDArray {
    public int maxTotal(int[][] arr) {
        int maxValue = 0;
        HashMap<String,Integer> position = new HashMap<>();
        for(int i = 0; i< 6; i++) {
            for(int j=0; j<6; j++) {
                //System.out.println(arr[i][j]);
                String oldPos;
                String pos=i+""+j;
                int value = 0;
                if (j+2 < 6) {
                    value = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                    position.put(pos, value);

                    if (i > 1) {
                        oldPos = (i-2)+""+j;
                        position.put(oldPos, position.get(oldPos)+value);
                    }
                }

                if (i > 0 && i < 6-1 && j>0 && j < 6-1) {
                    oldPos = (i-1)+""+(j-1);
                    position.put(oldPos, position.get(oldPos) + arr[i][j]);
                }
            }
        }
        for (Map.Entry<String, Integer> entry:position.entrySet()) {
            if (maxValue < entry.getValue()) {
                maxValue = entry.getValue();
            }
        }
        System.out.println(position);
        System.out.println(maxValue);
        System.exit(0);

        return maxValue;
    }
}
