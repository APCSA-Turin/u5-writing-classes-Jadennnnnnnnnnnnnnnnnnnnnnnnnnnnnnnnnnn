public class Student {
    private static int totalPoints = 0;
    private static int mostPoints = 0 ;

    private String fname;
    private int points = 0;

    public Student(String name) {
        fname = name;
    }

    public static int getTotalPointsEarned() {
        return totalPoints;
    }

    public static int getGreatestPoints() {
        return mostPoints;
    }

    public void addPoints(int add) {
        points += add;
        totalPoints += add;

        if (points > mostPoints) {
            mostPoints = points;
        }
    }

    public String studentInfo() {
        String str = "Student: " + fname;
        str += "\nStudent's Points: " + points;
        return str;
    }

    public String classInfo() {
        String str = "Total points earned by all students: " + totalPoints;
        str += "Most points earned by any student: " + mostPoints;
        return str;
    }
}
