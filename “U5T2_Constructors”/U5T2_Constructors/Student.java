/**
 * This class represents a student object
 * 
 * @author Jaden
 */
public class Student {
    /** The name of the student */
    private String name;

    /** The grade of the student */
    private int gradeLevel;

    /** The school the student is in */
    private String school;
  
    /** 
     * Instantiates a Student object
     * 
     * @param name The name
     * @param grade The grade level
     * @param school The name of the school
     */
    public Student(String name, int grade, String school) {
        this.name = name;
        gradeLevel = grade;
        this.school = school;
    }

    /** 
     * Instantiates a Student object
     * <p>
     * Sets high school to a certain type depending on grade
     * 
     * @param name The name
     * @param grade The grade level
     */
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
  
    /** 
     * Returns the information of the student (includes their name, grade level and school)
     * 
     * @return The information of the student in a string
     */
    public String studentInfo() {
      return name + " is in grade " + gradeLevel + " and goes to " + school;
    }
  }
  