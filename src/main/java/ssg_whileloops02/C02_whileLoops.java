package ssg_whileloops02;

import java.util.Random;
import java.util.Scanner;

public class C02_whileLoops {

    // bilgisayara 1 ile 100 arasinda bir sayi tutturun
    // kullanicidan bu sayiyi tahmin etmesini isteyin
    // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
    // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
    // Random rnd=new Random();
    // int sayi=rnd.nextInt(100);//burasi bize 100den kucuk random sayi uretmek icin var
    //odev!!!! kullaniciya 5 tahmin hakkı verin bulursa tebrik edin(break atmayi unutmayin)
    // bulamazsa exit atip tekrar oynamasini isteyin
    public static void main(String[] args) {
        Random rnd = new Random();
        int sayi = rnd.nextInt(100);
        Scanner input = new Scanner(System.in);
        int kullaniciSayi = -1;
        int tahminSayisi = 0;
        while (kullaniciSayi != sayi) {
            System.out.println("lutfen tahminde bulunmak icin 1-100 arasinda sayi giriniz");
            kullaniciSayi = input.nextInt();
            if (kullaniciSayi < 0 || kullaniciSayi > 100) {
                System.out.println("lutfen verilen aralikta bir tahmin yapiniz");
                continue;
            }
            tahminSayisi++;
            if (kullaniciSayi < sayi) {
                System.out.println("lutfen biraz daha buyuk bir sayi girinz");
            } else if (kullaniciSayi > sayi) {
                System.out.println("lutfen biraz daha kucuk bir sayi girinz");
            }
        }
    }
}
