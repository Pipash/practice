public class CountFactors {
    public int factor(int N) {
        int numberOfFactors = 2;
        if (N == 1) {
            return 1;
        }
        int i = 2;
        while (i*i <= N) {
            if (N % i == 0) {
                numberOfFactors += 2;
                //System.out.print(i+", "+N/i+", ");
            }

            if (i*i == N) {
                numberOfFactors -= 1;
            }

            i++;
        }

        //System.out.println('\n');
        return numberOfFactors;
    }
}
