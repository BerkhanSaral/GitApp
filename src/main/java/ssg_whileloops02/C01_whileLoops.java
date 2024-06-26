package ssg_whileloops02;

import java.util.Scanner;

public class C01_whileLoops {
    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int sayi = 1;
        while (sayi != 0) {
            System.out.println("lutfen toplamak istediginiz sayilari giriniz");
            sayi = input.nextInt();
            if (sayi > 0) {
                toplam += sayi;
            }

        }
        System.out.println("toplam = " + toplam);
    }
}
