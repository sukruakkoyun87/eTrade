package core.Mail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailValidator {

    public  static  boolean emailValidation(String mail){

        String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern= Pattern.compile(expression);
        Matcher matcher=pattern.matcher(mail);
        if (mail==null&& pattern.matcher(mail).matches()==false){
            System.out.println("Mail Adresi Geçersiz");
        }
        return matcher.matches();
    }



}
