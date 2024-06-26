package day01;

import java.util.Locale;
import java.util.Scanner;

public class C01_Variables {
    public static void main(String[] args) {

        /*primitive
        8 adet
        byte short int long, float double,char, boolean

        non-primitive
        String Scanner Object Wrapper ve suanda olusturdugumuz class dahil tum classlar
        */

        // Bir yas variable'i olustur ve yazdir

        byte age = 29;
        System.out.println("age = " + age);//age.soutv


        //(int) bir variable(sayi)  olustur ve (deger olarakta 50 verelim) yazdır

        int variable = 50;
        System.out.println(variable);

        // Bir benimYasim variable'i olustur, mevcut yas degiskenini kendisine ata

        int myAge = age;
        System.out.println("myAge = " + myAge);

        // Birkac isim variable'i olustur, yazdir

        String name1 = "Berkhan", name2 ="Ali",name3="Serkan";
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);
        System.out.println("name3 = " + name3);

        // Bir benimIsmim variable'i olustur, mevcut isim degiskenlerinden birini kendisine ata

        String myName=name1;
    }
}
