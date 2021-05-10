package core.googleAuth;

import entities.concretes.User;

public  class GoogleAuthorize {

   public static void Authentication(User user){

      System.out.println("Google Hesabı ile Kayıt Yapıldı "+user.getEmail());

   }

}
