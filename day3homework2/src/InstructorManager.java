import java.util.ArrayList;
import java.util.List;

public class InstructorManager extends  UserManager{

    public void addCourse(Instructor instructor){
        System.out.println("Kurs Eklendi: "+instructor.getCourseName() +"," +" ekleyen "+instructor.getFirstName());
    }

}
