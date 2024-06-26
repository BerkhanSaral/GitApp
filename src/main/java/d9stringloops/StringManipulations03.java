package d9stringloops;

import java.util.Locale;
import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*Ornek 1: Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin.

        1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.
        2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
        3- Başında ve sonunda boşluk olmamalıdır.*/

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("lutfen parola giriniz");
        String password = input.nextLine();

        boolean passwordCheck=password.isEmpty();
        System.out.println(passwordCheck);

        boolean spaceCheck =password.isBlank();
        System.out.println(spaceCheck);

        boolean leftandRight =password.trim().equals(password);
        System.out.println(leftandRight);
        if(passwordCheck){
            System.out.println("bos gecilemez");
        }
        if(spaceCheck){
            System.out.println("sadece space girilmez");
        }
        if(!leftandRight){
            System.out.println("basta ve sonda bosluk olamaz");
        }




















        /*Example 1: Check if a password has the following conditions.

        1- The password must contain at least one character, nothing must be entered.
        2- The characters must not only consist of (space) characters, but also non-space characters.
        3- There should be no spaces at the beginning and end.*/

        //Not: isEmpty() metodu sadece hicligi kontrol eder (true verir).
        //isBlank() metodu ise hem hicligi hemde space’i kontrol eder(true verir)
/*
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("lutfen parola giriniz");

        //1- Parola hicbir sey girilmeden gecilmemeli en az 1 karakter girilmeli
        String password = input.nextLine();
        boolean first = password.isEmpty();// "" - true, "a" - false, " " - false

        //2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı,
        // space harici karakterlerde bulunmalidir.

        boolean second = password.isBlank();// "" - true, "a" - false, " " - true
        System.out.println(second);

        //3. Basinda ve sonunda bosluk olmamalidir
        //Basindaki veya sonundaki bosluklari alinca ilk haline esitse orjinalinde bosluk yoktur

        boolean third = password.trim().equals(password); // " a" da false uretir cunku boslsuk var basinda
        System.out.println(third);

        if (first) {
            System.out.println("parola hicbir sey yazmadan gecilemez");
        }
        if (second) {
            System.out.println("parola bos birakilmamali ve bosluk harici karakterlerde bulunmalidir");
        }
        if (!third) {//false`i true yaptik ve yazdik
            System.out.println("parolanin basina veya sonunda bosluk birakilmamali");
        }*/
    }
}
