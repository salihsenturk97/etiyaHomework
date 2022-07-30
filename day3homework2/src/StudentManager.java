public class StudentManager extends  UserManager{
    public void registerCourse(Student student){
        System.out.println(student.getFirstName()+" Adlı öğrenci "+student.getCoursesTaken()+" adlı kursa kayıt oldu" );
    }
}
