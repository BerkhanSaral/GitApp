package day03;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
/*
              Kullanicidan bir kelime sisteme girmesini isteyiniz.
              kelimede ilk c harfi rastlanilana kadar a harflerinin sayisini yazdiriniz.
         */
        // babacan --> 2
        // bir yapının tüm elemanlarını tek tek gözden geçirmemiz gereken durumlarda forloop ya da loop döngüleri kullanılır

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen en sevdiginiz kelimeyi sisteme giriniz");
        String str = input.next();
        int sayac = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                sayac++;
            }
             else if (str.charAt(i) == 'c') {
                break;
            }
            System.out.println(str.charAt(i));
        }


    }
}
