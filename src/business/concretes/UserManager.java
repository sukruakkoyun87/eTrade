package business.concretes;

import business.abctracts.UserService;
import core.Mail.CheckMailValidator;
import core.Mail.MailValidator;
import core.googleAuth.GoogleAuthorize;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.sql.SQLOutput;
import java.util.List;

public class UserManager implements UserService {

    private UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        checkEmail(user);
        if (user.getFirstName().length()>=2&&user.getLastName().length()>=2){
            if (user.getPassword().length()>=6){
                MailValidator.emailValidation(user.getEmail());
                this.userDao.add(user);
                CheckMailValidator.verificationCheck(user.getEmail());

            }else{
                System.out.println("Şifre 6 karakter olmalıdır");
            }

        }else {
            System.out.println("Ad ve Soyad iki Karakterden Fazla Olamaz !");
        }


    }

    @Override
    public List<User> getAll() {
     return this.userDao.getAll();
    }

    @Override
    public void googleSignIn(User user) {
        System.out.println("Google Hesabı ile Oturum Aç ");
        GoogleAuthorize.Authentication(user.getEmail());
        this.userDao.add(user);
      CheckMailValidator.verificationCheck(user.getEmail());
    }

    @Override
    public boolean checkEmail(User user) {
        if (this.userDao.getByMail(user.getEmail())==null){
            System.out.println("Mail Adresi Kullanilabilir");
            return true;
        }else {
            System.out.println("Mail Adresi Zaten Kullanılıyor "+user.getEmail());
            return false;
        }

    }
}
