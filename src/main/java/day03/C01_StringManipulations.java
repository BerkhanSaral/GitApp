package day03;

import java.util.Scanner;

public class C01_StringManipulations {
    public static void main(String[] args) {
                /*
        toLowerCase:harfleri kucultmeyi saglar
        toUpperCase:harfleri buyultmeyi saglar
        length:karakter sayisini yani uzunlugunu verir
        equals:esit mi diye kontrol eder (peki == farki nedir =='hem adrese hem degere bakar fakat equals methodu sadece degere bakar)
        equalsIgnoreCase:buyuk kucuk harf farketmeksizin esit mi diye kontrol eder
        indexOf:girilen karakterin ilk indexini dondurur
        lastIndexOf:girilen karakterin son indexini dondurur
        charAt:girilen indexteki karakteri dondurur
        trim:bastaki ve sondaki bosluklari siler
        split:icine girilen degerden boler sag ve sol olmak uzere secim yaptırır(0 sol/1 sag)
        replace:icindeki datayi degistirmeyi saglar
        replaceAll:icindeki datyi gruplar halinde(regex) degistirmeyi saglar
        concat:birlestirme islemi yapar
        subString:ilk girilen indexten ikinci indexe kadar(ikinci index dahil degildir) olan degeri bize dondurur
        valueOf:String'i baska dataya baska datalari String'e cevirmeyi saglar.
        contains:icerme durumunu kontrol eder
        endsWith:ne ile bittigini kontrol eder
        startsWith:ne ile basladigini kontrol eder
        isBlank:hem bos mu diye kontrol eder bos degilse sadece bosluk karakter var mi diye kontrol eder
        isEmpty:bos mu diye kontrol eder
         */

        /*
            Kullanicidan ad ve soyadini aralarinda bir bosluk olacak sekilde sisteme girmesini isteyiniz.
            NOT : Yalnizca bir ad bir soyad girilmeli
            Ad ve Soyadi ilk harfleri buyuk olacak sekilde alt alta yazdirin
            Ad : Canan
            Soyad : Can
        */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir ad ve bir soyad giriniz");
        String name = input.nextLine().trim();
        System.out.println("kullanicidan alinan orijinal deger : " +name);
        System.out.println("isim : " + name.toUpperCase().charAt(0) + name.substring(1, name.indexOf(" ")));
        System.out.println("soy isim : " + name.split(" ")[1].toUpperCase().charAt(0)
                + name.split(" ")[1].substring(1));


        int uzunluk = name.length();
        System.out.println("uzunluk " + uzunluk);

        //charAt(int index) metodu, belirtilen index'te yer alan karakteri döndürmek için kullanılır.
        //Indeks 0 tabanlıdır, yani ilk karakterin indeksi 0'dır, ikinci karakterin indeksi 1, ve böyle devam eder.
        //Java'da indexleme, genellikle diziler (arrays), dizeler (Strings) veya koleksiyonlar (collections)
        // gibi bir veri yapısındaki belirli bir elemana erişmek için kullanılan bir tekniktir.

        char karakter = name.charAt(name.length() - 1);
        System.out.println(karakter);


        //substring(int beginIndex, int endIndex): Belirtilen indeks aralığındaki substring'i döndürür.
        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4)

        String ad = name.substring(0, name.indexOf(" "));
        System.out.println(ad);

        //startsWith() methodu bir Strig'in ilk karakterini/karakterlerini kontrol eder
        //startsWith() methodu boolean return eder.


        boolean aliIleBasliyormu = name.toUpperCase().startsWith("Ali");
        System.out.println(aliIleBasliyormu);
    }
}
