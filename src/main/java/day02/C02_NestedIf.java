package day02;

import java.util.Locale;
import java.util.Scanner;

public class C02_NestedIf {
    public static void main(String[] args) {
           /*
            Kullanicidan sisteme bir numara girmesini isteyin.
            Eger numara sifirdan kucukse, console da "Negatif Sayi" yazdirin.
            Degilse, 10'dan kucuk olup olmadigina bakin. 10'dan kucukse console a "Rakam" yazdirin,
            10'dan buyuk veya esitse console a "Pozitif Sayi" yazdirin.
        */

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("bir numara giriniz");
        int num = input.nextInt();
        if(num<0){
            System.out.println("Negatif Sayi");
        }
        else {
            if(num<10){
                System.out.println("rakam");
            }
            else {
                System.out.println("Pozitif Sayi");
            }
        }

    }
}
