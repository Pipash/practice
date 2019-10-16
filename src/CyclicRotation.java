
public class CyclicRotation {
    public int[] rotation(int[] A, int K) {
        if (A.length < 1) {
            return null;
        }
        if (K < 0) {
            return null;
        }
        int length = A.length;
        int[] finalArray = new int[length];
        int i = 0;
        while (i < K) {
            finalArray = new int[length];
            finalArray[0] = A[A.length-1];
            int increment = 1;
            for (int j = 0; j < A.length - 1; j++) {
                finalArray[increment] = A[j];
                increment++;
            }
            A = finalArray;
            i++;
        }

        return finalArray;
    }

    public void watch(int[] A, int K) {
        int[] finalArray = new int[A.length];
        int i = 0;
        while (i < K) {
            //finalArray[0] = A[A.length-1];
            /*int increment = 1;
            for (int j = 0; j < A.length - 2; j++) {
                finalArray[increment] = A[j];
                increment++;
            }
            A = finalArray;*/
            i++;
        }

        //System.out.println(finalArray);
    }
}
