package day03;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        // Kullanicidan sisteme bir sayi girmesini isteyiniz,
        // kullanicinin girdigi sayidan baslayarak, 10'un katina gelene kadar ardisik yazdiriniz.
        // Orn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen 1 tam sayi");
        /*
        int num=input.nextInt();
        while (num%10!=0){
            System.out.println(num+" ");
            num++;
        }
        */

        for (int sayi = input.nextInt(); sayi%10!=0  ; sayi++) {
            System.out.println(sayi+" ");
        }

    }
}
