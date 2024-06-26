package day01;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // Kullanicidan kilosunu ve boyunu alin, vucut kitle indeksini gosterin.
        // kilo/(boy*boy)

        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen boyunuzu giriniz");
        double height=input.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz");
        double weight=input.nextDouble();

        System.out.println("Vucut kitle indeksi"+weight/(height*height));
    }
}
