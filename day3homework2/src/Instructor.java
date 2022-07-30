public class Instructor extends User{
    private String courseName ;
    private double salary;


    public Instructor(int id, String firstName, String lastName, String nationalId, String eMail, String courseName, double salary) {
        super(id, firstName, lastName, nationalId, eMail);
        this.courseName = courseName;
        this.salary = salary;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
