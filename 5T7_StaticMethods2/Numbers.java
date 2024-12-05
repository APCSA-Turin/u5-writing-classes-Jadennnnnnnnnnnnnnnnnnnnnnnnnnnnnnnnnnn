public class Numbers {
    private int num;
    public static int largestNum = 0;

    Numbers(int num) {
        this.num = num; //B
        if (num > largestNum) {
            largestNum = num;
        }
    }

    public boolean isPrime() {
        return Maths.isPrime(num); //E
    }

    public int factorial() {
        return Maths.factorial(num); //E
    }

    public String numberSummary() {
        return "Number: " + num + ", Prime: " + isPrime() //C 
                + ", Factorial: " + factorial(); //B
    }

    private boolean even() {
        return num % 2 == 0;
    }

    public String evenOrOdd() {
        if (even()) {
            return "Even";
        } else return "Odd";
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public String addToString() {
        int difference = subtract(largestNum, num); //D
        return "Number: " + num + ", Added: " + difference + ", to get to the largest number";
    }
}
