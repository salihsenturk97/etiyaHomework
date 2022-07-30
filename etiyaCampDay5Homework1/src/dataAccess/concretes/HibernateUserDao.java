package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {
    @Override
    public void createUser(User user) {
        System.out.println("Kullanıcı oluşturuldu : " + user.getFirstName() + " Mail: " + user.geteMail());

    }

    @Override
    public void getUser(User user) {

        System.out.println("Adı: " + user.getFirstName() + "Soyadı: " + user.getLastName() + " Mail: " + user.geteMail() + "Şifresi: " + user.getPassword());

    }

    @Override
    public void deleteUser(User user) {

        System.out.println("Kullanıcı veritabanında silindi : " + user.getFirstName() + " Mail: " + user.geteMail());

    }

    @Override
    public void updateUser(User user) {

        System.out.println("Kullanıcı güncellendi : " + user.getFirstName() + " Mail: " + user.geteMail());

    }
}
