public class CountDiv {
    public int solution(int A, int B, int K) {
        int divNumber = 0;
        if (A < 0) {
            return divNumber;
        }

        if (A < K && B < K) {
            return divNumber;
        }

        if (A < K) {
            A = K;
        }

        int difference = B-A;
        if (difference == 0) {
            return divNumber;
        }

        divNumber = Math.round(difference / (float) K);
        if (A == K) {
            divNumber++;
        }

        return divNumber;
    }
}
