public class FirstFactorial {
    public static int Factorial(int num) {
        // code goes here
        if (num == 1) {
            return 1;
        }
        return num * Factorial(num - 1);
    }
}
