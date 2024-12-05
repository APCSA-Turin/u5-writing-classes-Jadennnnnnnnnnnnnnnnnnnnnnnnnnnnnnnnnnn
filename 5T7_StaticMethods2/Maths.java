public class Maths {
    private Maths() {}

    public static int factorial(int n) {
        return calculateFactorial(n); //A
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static int calculateFactorial(int n) {
        int x = 1;
        for (int i = 2; i <= n; i ++) {
            x *= i;
        }
        return x;
    }
}