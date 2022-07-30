import java.util.ArrayList;
import java.util.List;

public class UserManager {
    List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }
    public List<User> getAll(List<User> users) {
        System.out.println("Kullanıcılar Listelendi: ");
        for ( User user: users  ) {
            System.out.println(user.getFirstName());
        }
    return users;
    }
    public void add(User user){
        System.out.println("User added: "+user.getFirstName());
    }
    public void update(User user){
        System.out.println("User update: "+user.getFirstName());
    }
    public void delete(User user){
        System.out.println("User delete: "+user.getFirstName());
    }

}
