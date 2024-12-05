public class Employee {
    private String fname;
    private String lname;
    private int id;
    private static int recentid = 99;
    private static int numberEmployees = 0;

    public Employee(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;

        recentid ++;
        numberEmployees ++;
        id = recentid;
    }

    public int getID() {
        return id;
    }

    public String getFullName() {
        return fname + " " + lname;
    }

    public static int getMostRecentEmployeeID() {
        return recentid;
    }

    public static int getTotalEmployeesCreated() {
        return numberEmployees;
    }

    public String employeeInfo() {
        String str = "--------------------------";
        str += "\nEmployee full name: " + getFullName();
        str += "\nEmployee ID: " + id;
        str += "\nMost recent ID assigned: " + recentid;
        str += "\nTotal employees hired: " + numberEmployees;
        str += "\n--------------------------";
        return str;
    }
}