public class Student {
    private String name;
    private int gradeLevel;
    private String school;
  
    public Student(String name, int grade, String school) {
        this.name = name;
        gradeLevel = grade;
        this.school = school;
    }

    public Student(String name, int grade) {
        this.name = name;
        gradeLevel = grade;
        if (grade >= 9 && grade <= 12) {
            school = "high school";
        } else if (grade >= 6 && grade <= 8) {
            school = "middle school";
        } else if (grade >= 1 && grade <= 5) {
            school = "elementary school";
        } else school = "unknown";
    }
  
    public String studentInfo() {
      return name + " is in grade " + gradeLevel + " and goes to " + school;
    }
  }
  