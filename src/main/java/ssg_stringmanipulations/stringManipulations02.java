package ssg_stringmanipulations;

import java.util.Scanner;

public class stringManipulations02 {
    public static void main(String[] args) {
                 /*
          Kullanicidan email adresini girmesini isteyin,
          mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
          @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
          odev!! bosluk karakteri varsada hata mesaji verin
         */

        Scanner input =new Scanner(System.in);
        System.out.println("lutfen gmail adresinizi giriniz");

        String mail=input.nextLine();

        if(!mail.contains("@gmail.com")){
            System.out.println("lutfen gmail adresini giriniz");
        }
        else if(mail.endsWith("@gmail.com")) {
            System.out.println("email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontrol ediniz");
        }

    }
}
