package day03;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        /*
            Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
            Kullaniciya bitirmek istediginde 0'a basmasini soyleyin

            kullanici bitirmek istediginde
            toplam kac adet pozitif tam sayi girdigini
            ve bunlarin toplaminin kac oldugunu yazdirin

            kullanici negatif sayi girerse
            "negatif sayi kullanamazsiniz " yazdirin
            bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */

        // Diger looplardan en onemli farki en az bir kere calismasidir
        Scanner input = new Scanner(System.in);
        int s;
        int sayac = 0;
        int topla = 0;
        do {
            System.out.println("lutfen bir sayi giriniz");
            s = input.nextInt();
            if (s > 0) {
                sayac++;
                topla += s;
            } else if (s<0) {
                System.out.println("negatif sayi kullanamazsiniz");
            }

        } while (s != 0);
        System.out.println("toplam "+ sayac+" sayi girdiniz ve toplamlari: "+topla);
    }
}
