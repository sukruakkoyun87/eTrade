package core.Mail;

public class CheckMailValidator {

    public static void verificationCheck(String mail){
        checkMailValid(mail);
        verificationLink();
        verificationOk(mail);
    }

    private static void checkMailValid(String mail){
       System.out.println("Doğrulamak istediğiniz e-posta adresinize gidin ");
    }
    private static void verificationLink(){
        System.out.println("Kayıt işlemini tamamlamak için bu bağlantıya tıklayın");
    }

    private static void verificationOk(String mail){

        if (mail==null){
            System.out.println("Kayıt işlemi başarısız");
        }else {
            System.out.println("Kayıt işlemi başarılı. Devam etmek için Tıklayınız...! ");
        }

    }


}
