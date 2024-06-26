package d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        //Scanner ve Random class'larindan object uretelim

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        //Scanner ve Random class'larindan object uretelim

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        //0 ile 100 arasinda rastgele bir sayi uretelim
        int rastgeleSayi = random.nextInt(101);

        //ODEV: 20(dahil) ile 100(dahil) arasında random sayi isteseydik?

        //Kullanicinin kac kere tahmin yaptigini takip etmek icin bir sayac olusturalim
        int denemeSayisi = 0;

        //Kullanicinin yaptigi tahmini saklamak icin bir degisken olusturalim
        int tahminEdilen;

        //Kullanicinin sayiyi dogru tahmin edip etmedigini kontrol etmek icin bir boolean degisken olusturalim
        boolean tahminDogrumu = false;

        System.out.println("0 ile 100 arasinda bir sayiyi tahmin etmeye calisin");

        do {
            System.out.println("tahmini yapiniz");
            tahminEdilen = input.nextInt();
            denemeSayisi++;

            //Tahmini kontrl edeleim

            if (tahminEdilen < rastgeleSayi) {
                System.out.println("Sayi daha buyuk");
            } else if (tahminEdilen > rastgeleSayi) {
                System.out.println(" Sayi daha kucuk");
            } else {
                tahminDogrumu = true;
                System.out.println("Tebrikler sayi dogru");
                System.out.println("deneme sayisi : " + denemeSayisi);
            }
        } while (!tahminDogrumu);
        input.close();


    }
}
