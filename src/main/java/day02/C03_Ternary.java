package day02;

import java.util.Locale;
import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        /*
             Kullanicidan bir sayi sisteme girmesini isteyin
             Ternay kullanarak;
             Girilen sayi cift ise console a "Cift Sayi" yazdirin.
             Girilen sayi tek ise girilen sayiyi 3 artirarak console a yazdiriniz.
         */

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("bir sayi giriniz");
        int num = input.nextInt();
       /* if(num%2==0){
            System.out.println("cift sayi");
        }else {
            System.out.println(num+3);
        }
        */
        System.out.println(num % 2 == 0 ? "Cift sayi" : num + 3);

    }
}
