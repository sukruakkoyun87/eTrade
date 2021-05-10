package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

   List<User> userList=new ArrayList<User>();
    @Override
    public void add(User user) {
        userList.add(user);
        System.out.println("Kullanıcı Eklendi : "+user.getFirstName()+" "+user.getLastName());
    }

    @Override
    public void update(User user) {
        System.out.println("Kullanıcı Güncellendi : "+user.getFirstName()+" "+user.getLastName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı Silindi : "+user.getFirstName()+" "+user.getLastName());
    }

    @Override
    public List<User> getAll() {
        return userList;
    }

    @Override
    public User getByMail(String mail) {
        for (User user : userList) {
            if (user.getEmail().equals(mail))
                return  user;
        }
        return null;
    }
}
