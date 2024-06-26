package d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi ve Soyadinzi Giriniz");
        //nextLine() methodu ile birden fazla kelime girisi alabilirsiniz
        String nameAndSurname = input.nextLine();

        System.out.println("Yasinizi Giriniz");
        byte age = input.nextByte();

        System.out.println("Boyunzu Giriniz");
        float height = input.nextFloat();

        System.out.println("Kilonuzu  Giriniz");
        Short weight = input.nextShort();

        System.out.println("Medeni Durumunuzu Giriniz");
        //next() methodu ile tek kelimeli String girisi alabilirsiniz
        String maritalStatues = input.next();

        System.out.println("Ad Soyad: "+nameAndSurname+" Yas: "+age+" Boy: "+height+" Kilo: "+weight+" Medeni Durum: "+maritalStatues);



    }
}
