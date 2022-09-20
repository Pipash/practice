import java.util.Arrays;

public class PermMissingElem {
    public int missingElem(int[] A) {
        int missing = 1;
        if (A.length == 0) {
            return missing;
        }
        Arrays.sort(A);
        //System.out.println(A.length);
        int j = 1;
        for (int value : A) {
            if (value != j) {
                missing = j;
            }
            j++;
        }

        return missing;
    }
}
