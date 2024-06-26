package day01;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
        // Kullanicidan bir sayi alin, karesini bulun.
        System.out.println("Karesini almak istediginiz sayiyi giriniz");
        float num = input.nextFloat();
        System.out.println("num = " + num * num);
*/

        String str1 = input.next();
        System.out.println("str1 = " + str1);
        String str2 = input.nextLine();
        System.out.println();
        System.out.print("str2 = " + str2);
    }
}
