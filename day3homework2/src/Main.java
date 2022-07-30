import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Salih", "Şentürk", "465123789", "salih@salih.com", 2535, "Java");
        Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "12345679", "engin@engin.com", "Angular", 50000);
        List<User> users = new ArrayList<>();
        UserManager userManager = new UserManager();
        users.add(student1);
        users.add(instructor1);
        userManager.getAll(users);

        StudentManager studentManager = new StudentManager();
        System.out.println("-----------------");
        studentManager.registerCourse(student1);
        System.out.println("-----------------");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addCourse(instructor1);

        userManager.add(instructor1);
        System.out.println("-----------------");
        userManager.add(student1);



    }
}