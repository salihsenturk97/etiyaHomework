package business.abstracts;

import entities.concretes.User;

import java.util.ArrayList;

public interface UserService {
    void register(User user);

    boolean hasSystem(User user, ArrayList<String> eMailList);

    void login(User user);

    void deleteAccount(User user);
}
