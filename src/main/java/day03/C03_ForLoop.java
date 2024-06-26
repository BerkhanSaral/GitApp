package day03;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {
         /*
           Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
           Bu sayılardan birler basamağı 7 veya 9 olanlar hariç diğerlerinin toplamını bulunuz
     */

        // Java da her zaman için kısa ve anlaşılır kodlar daha iyidir. Java hiç bir zaman tekrarı sevmez

        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i < 6; i++) {

            System.out.println(i + ". sayiyi giriniz");
            int s = input.nextInt();
            if ((s % 10 == 7) || s % 10 == 9) {
                continue;
            }
            sum += s;

        }
        System.out.println("Toplam = " + sum);


    }
}

