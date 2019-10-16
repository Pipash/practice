public class TapeEquilibrium {
    public int eqilibirum(int[] A) {
        int shortest_difference = 0;
        if (A.length == 0) {
            return 0;
        }
        //System.out.println(A.length);
        //System.exit(0);

        int n = A.length;
        int p = n - 1;
        for (int i = 1; i <= p; i++) {
            //int j = i-1;
            int sum1 = 0;
            int sum2 = 0;

            //calculate first sum
            if ((i-1) == 0) {
                sum1 = A[i-1];
            } else {
                //sum1 = (i*(A[0]+A[i-1]))/2;
                //System.out.println("sum1 = "+ i+"*"+A[0]+"+"+A[i-1]+"/"+2);
                for (int j = 0; j < i; j++) {
                    sum1 += A[j];
                }
            }

            //calculate second sum
            if (i==p) {
                sum2 = A[i];
            } else {
                //sum2 = ((n-i)*(A[i] + A[p]))/2;
                for (int j = i; j <= p; j++) {
                    sum2 += A[j];
                }
            }

            //System.out.println(sum1+" - "+sum2);

            int distance = Math.abs(sum1 - sum2);
            if (i == 1) {
                shortest_difference = distance;
            } else if (distance < shortest_difference) {
                shortest_difference = distance;
            }
        }

        return shortest_difference;
    }
}
