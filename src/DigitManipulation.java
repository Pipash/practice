public class DigitManipulation {
    int digitsManipulations(int n) {
        if (n == 0) {
            return 0;
        }
        int i = n;
        int product = 1;
        int sum = 0;
        while (i > 9) {
            product *= i % 10;
            sum += i % 10;
            i = i / 10;
        }
        product *= i;
        sum += i;

        return (product - sum);

    }
}
