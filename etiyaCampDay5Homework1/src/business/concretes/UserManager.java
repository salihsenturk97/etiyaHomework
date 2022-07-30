package business.concretes;

import business.abstracts.UserService;
import core.abstracts.EmailValidator;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;

public class UserManager implements UserService {
    private ArrayList<String> eMailList;
    private UserDao userDao;
    private EmailValidator emailValidator;

    public UserManager(ArrayList<String> eMailList, UserDao userDao, EmailValidator emailValidator) {
        this.eMailList = eMailList;
        this.userDao = userDao;
        this.emailValidator = emailValidator;
    }

    @Override
    public void login(User user) {
        if (hasSystem(user, eMailList)) {
            userDao.getUser(user);
            System.out.println("Giriş yapıldı anasayfaya yönlendiriliyorsunuz.");
        } else {
            System.out.println("Üyelik bulunamadı, lütfen kayıt olun.");
        }
    }

    @Override
    public void deleteAccount(User user) {
        try {
            eMailList.remove(user.geteMail());
        } catch (Exception e) {
            System.out.println("Silmek istediğiniz kullanıcı mevcut değil \n Hata :" + e);
            return;
        }
        userDao.deleteUser(user);
    }

    @Override
    public void register(User user) {
        if (hasSystem(user, eMailList)) {
            System.out.println("Bu email ile daha önce kayıt olmuşsunuz, lütfen giriş yapın.");
        } else {

            if (user.getPassword().length() >= 6 && user.getFirstName().length() >= 2 && user.getLastName().length() >= 2) {

                //
                System.out.println("Doğrulama maili gönderildi.");


                eMailList.add(user.geteMail());
                userDao.createUser(user);
            } else {
                System.out.println("Doğrulama Başarısız.");
            }

        }
    }

    @Override
    public boolean hasSystem(User user, ArrayList<String> eMailList) {
        if (eMailList.isEmpty()) {
            return false;
        } else {
            for (String email : eMailList) {
                if (email == user.geteMail())
                    return true;
            }
            return false;
        }


    }


}
