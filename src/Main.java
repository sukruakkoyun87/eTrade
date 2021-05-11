import business.concretes.UserManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user=new User(1,"Ab","Ak","mail@mail.com","123456");
        User user1=new User(2,"Bc","Ct","bc.ct@mail.com","123456");

       UserManager manager=new UserManager(new HibernateUserDao());
        System.out.println("------------------- Normal Kayıt --------------------------");
       manager.add(user);

        System.out.println("------------------- Google Sevisi ile Kayıt --------------------------");
       manager.googleSignIn(user1);

        System.out.println("------------------- Kullanıcı Listesi --------------------------");

        for (User user2 : manager.getAll()) {
            System.out.println(user2.getFirstName()+" "+user2.getLastName());
        }

    }
}
