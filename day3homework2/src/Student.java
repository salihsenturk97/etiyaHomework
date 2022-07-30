public class Student extends User {
    private int studentNumber ;
    private String coursesTaken;

    public Student() {
    }



    public Student(int id, String firstName, String lastName, String nationalId, String eMail, int studentNumber, String coursesTaken) {
        super(id, firstName, lastName, nationalId, eMail);
        this.studentNumber = studentNumber;
        this.coursesTaken = coursesTaken;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(String coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
}
