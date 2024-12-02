public class StepTracker {
    private int activeSteps;
    private int totalSteps = 0;
    private int totalDays = 0;
    private int numActiveDays = 0;
 
    StepTracker(int activeSteps) {
       this.activeSteps = activeSteps;
    }
 
    public int activeDays() {
       return numActiveDays;
    }
 
    public void addDailySteps(int steps) {
       totalSteps += steps;
       totalDays ++;
       if (steps >= activeSteps) {
          numActiveDays ++;
       }
    }
 
    public double averageSteps() {
        if (totalDays == 0) {
           return 0.0;
        }
        return (double) totalSteps / totalDays;
     }  
 }
 
