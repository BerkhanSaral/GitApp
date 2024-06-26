package day02;

import java.util.Locale;
import java.util.Scanner;

public class C05_Switch {
    public static void main(String[] args) {
         /*
             Kullanicidan 0-4 arasi sinav puanini sisteme girmesini isteyiniz.

             Eger puani 0,0 - 1,0 arasinda ise KALDI seviyesi veriniz
                  puani 1,0 - 2,0 arasinda ise GECTİ seviyesi veriniz
                  puani 2,0 - 2,5 arasinda ise İYİ seviyesi veriniz
                  puani 2,5 - 3,5 arasinda ise UST seviyesi veriniz
                  puani 3,5 - 4,0 arasinda ise HARİKA seviyesi veriniz

              switch case kullanarak KALDI seviyesine F harf notu veriniz
                                     GECTİ seviyesine D harf notu veriniz
                                     IYI seviyesine C harf notu veriniz
                                     UST seviyesine B harf notu veriniz
                                     HARİKA seviyesine A harf notu veriniz
         */


        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("0-4 arasi puan giriniz");
        double num = input.nextDouble();
        String str = "";
        if (num >= 0.0 && num < 1.0) {
            str = "KALDI";
            System.out.println(str);
        } else if (num >= 1.0 && num < 2.0) {
            str = "GECTİ";
            System.out.println(str);
        } else if (num >= 2.0 && num < 2.5) {
            str = "İYİ";
            System.out.println(str);
        } else if (num >= 2.5 && num < 3.5) {
            str = "UST";
            System.out.println(str);
        } else if (num >= 3.5 && num < 4) {
            str = "HARİKA";
            System.out.println(str);
        } else {
            System.out.println("ATANMADI, sinav puani 0-4 arasinda olmalidir");
        }

        switch (str) {
            case "KALDI":
                System.out.println("F");
                break;
            case "GECTİ":
                System.out.println("D");
                break;
            case "İYİ":
                System.out.println("C");
                break;
            case "UST":
                System.out.println("B");
                break;
            case "HARİKA":
                System.out.println("A");
                break;
            default:
                System.out.println("Atanmadi,lutfen gecerli bir puan giriniz");
                break;
        }


    }
}
