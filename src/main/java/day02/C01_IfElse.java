package day02;

import java.util.Locale;
import java.util.Scanner;

public class C01_IfElse {
    public static void main(String[] args) {
        // kullanicidan iki sayi isteyin
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin
        // ikisi de negatif ise sayilarin carpimini yazdirin
        // ikisi farkli isaretlere sahip ise farkli isaretlerde sayilarla islem yapamazsin yazdirin
        // sayilardan sifira esit olan varsa sifir carmaya gore yutan elemandir yazdirin

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println(" sayi giriniz");
        int s1 = input.nextInt();
        System.out.println(" sayi giriniz");
        int s2 = input.nextInt();
        if (s1 > 0 && s2 > 0) {
            System.out.println("Toplam:" + (s1 + s2));
        } else if (s1 < 0 && s2 < 0) {
            System.out.println("Carpim:" + (s1 * s2));
        } else if ((s1 > 0 && s2 < 0)||(s1 < 0 && s2 > 0)){
            System.out.println("farkli isaretlerde islem yapamazsiniz");
        } else  {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }
    }
}
