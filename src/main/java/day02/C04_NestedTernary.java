package day02;

import java.util.Locale;
import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
        /*
             Kullanicidan ayri ayri iki tamsayi sisteme girmesini isteyin.
             Ternary kullanarak;
             Sayilar birbirine esit ise console da "Sayilar Birbirine Esit" yazdirin.
             Sayilar birbirine esit degilse, buyuk olan sayinin karesini ekrana yazdirin.
         */
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println(" sayi giriniz");
        int num1 = input.nextInt();
        System.out.println(" sayi giriniz");
        int num2 = input.nextInt();

        System.out.println((num1 == num2) ? ("Sayilar esit") : ((num1 > num2) ? (num1 * num1) : (num2 * num2)));
        Object Ternary = (num1 == num2) ? ("Sayilar esit") : ((num1 > num2) ? (num1 * num1) : (num2 * num2));
        System.out.println(Ternary);
    }
}

