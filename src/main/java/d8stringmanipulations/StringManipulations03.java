package d8stringmanipulations;

import java.util.Locale;
import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */


        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("password giriniz");
        String password = input.nextLine();

        boolean karakter = password.length() > 7;
        if (!karakter) {
            System.out.println("sifre 7 karakterden buyuk");
        }
        boolean space = password.replaceAll("[^ ]", "").length() != 0;
        if (space) {
            System.out.println("sifrede bosluk olamaz");
        }
        boolean upper = password.replaceAll("[^A-Z]", "").length() > 0;
        //    System.out.println(upper);
        if (!upper) {
            System.out.println("en az 1 tane buyuk harf icermelil");
        }

        boolean lower = password.replaceAll("[^a-z]", "").length() > 0;
        if (!lower) {
            System.out.println("en az 1 tane kucuk harf icermelil");
        }

        boolean shape=password.replaceAll("[^\\p{Punct}]", "") .length()>0;
        if (!shape){
            System.out.println("en az 1 tane ozel  harf icermelil");
        }

        boolean isValid=(karakter&&space&&upper&&lower&&shape);
        if(isValid){
            System.out.println("sifre gecerli");
        }
        if(!isValid){
            System.out.println("sifre gecersiz");
        }


        /*Example 1: Check the password entered by the user according to the following rules.

        i) At least 8 characters
        ii)Space character should not be in password
        iii) At least one capital letter
        iv) At least one lowercase letter
        v)At least one number */
/*
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("password giriniz");
        String password = input.nextLine();

        boolean lengthControl = password.length() > 7;
        //System.out.println("lengthControl = " + lengthControl);
        if (!lengthControl) {
            System.out.println("sifre en az 8 karakter olamlidir");
        }

        boolean spaceControl = password.replaceAll("[^ ]", "").length() == 0;
        //System.out.println("spaceControl = " + spaceControl);
        //boolean spaceContro1=!password.contains(" ");
        if (!spaceControl) {
            System.out.println("sifre icinde bosluk olamaz");
        }

        boolean upperCaseControl = password.replaceAll("[^A-Z]", "").length() > 0;
        //System.out.println("upperCaseControl = " + upperCaseControl);
        if (!upperCaseControl) {
            System.out.println("sifrede en az 1 buyuk karakter icermelidir");
        }

        boolean lowerCaseControl = password.replaceAll("[^a-z]", "").length() > 0;
        //System.out.println("lowerCaseControl = " + lowerCaseControl);
        if (!lowerCaseControl) {
            System.out.println("sifre en az 1 kucuk karakter icermelidir");
        }

        boolean digitControl = password.replaceAll("[^0-9]", "").length() > 0;
        //System.out.println("digitControl = " + digitControl);
        if (!digitControl) {
            System.out.println("sifre en az 1 rakam icermelidir");
        }

        //ODEV EN AZ 1 SEMBOL ICERMELI
        boolean sembolControl = password.replaceAll("[^\\p{Punct}]", "").length() > 0;
        //System.out.println("sembolControl = " + sembolControl);
        if (!sembolControl) {
            System.out.println("sifre en az 1 sembol icermelidir");
        }

        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl && sembolControl;
        if (isValid) {
            System.out.println("gecerli sifre");
        } else {
            System.out.println("gecersiz sifre!!!");
        }
*/

    }
}
