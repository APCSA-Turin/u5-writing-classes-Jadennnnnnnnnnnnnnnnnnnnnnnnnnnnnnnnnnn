public class Nums {
    private int num1;
    private int num2;
    private int numsGenerated = 0;

    public static int totalRandomNumsGenerated = 0;

    public Nums(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int randBetween() {
        numsGenerated++;
        totalRandomNumsGenerated++;
        return (int) (Math.random() * (num2 - num1)) + num1;
    }

    public int getRandomNumsGenerated() {
        return numsGenerated;
    }

    public static int getTotalRandomNumsGenerated() {
        return totalRandomNumsGenerated;
    }
}