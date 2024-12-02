public class additionPattern {
    private int current;
    private int start;
    private int add;
 
    public additionPattern(int start, int add) {
       this.start = start; current = start;
       this.add = add;
    }
 
    public int currentNumber() {
       return current;
       }
 
    public void next() {
       current  += add;
    }
 
    public void prev() {
       current -= add;
       if (current < start) {
          current = start;
       }
    }
}