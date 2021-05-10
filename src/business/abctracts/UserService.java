package business.abctracts;

import entities.concretes.User;

import java.util.List;

public interface UserService {

    void add(User user);
    List<User> getAll();
    void googleSignIn(User user);
    boolean checkEmail(User user);

}
