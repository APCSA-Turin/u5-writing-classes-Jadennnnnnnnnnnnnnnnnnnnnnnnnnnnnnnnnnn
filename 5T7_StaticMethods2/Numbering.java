public class Numbering {
    public static void start() {
        Numbers num1 = new Numbers(5);
        Numbers num2 = new Numbers(10);
        Numbers num3 = new Numbers(7);
        Numbers num4 = new Numbers(9);
        Numbers num5 = new Numbers(21);

        System.out.println("Number 1: ");
        numberInfo(num1);
        System.out.println();

        System.out.println("Number 1: ");
        numberInfo(num2);
        System.out.println();

        System.out.println("Number 1: ");
        numberInfo(num3);
        System.out.println();

        System.out.println("Number 1: ");
        numberInfo(num4);
        System.out.println();

        System.out.println("Number 1: ");
        numberInfo(num5);
        System.out.println();
    }

    public static void numberInfo(Numbers num) {
        System.out.println(num.numberSummary());
        System.out.println("Even or Odd: " + num.evenOrOdd());
        System.out.println(num.addToString());
    }
}
