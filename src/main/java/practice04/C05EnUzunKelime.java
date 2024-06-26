package practice04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C05EnUzunKelime {
    public static void main(String[] args) {
        // Kullanıcıdan alınan cümledeki en uzun kelimeyi(veya kelimeleri) listeleyen bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String word = input.nextLine().replaceAll("[.,]", "");
        String[] kelimeler = word.split(" ");

        System.out.println(Arrays.toString(kelimeler));

        int max = 0;
        for (String each : kelimeler) {
            max = Math.max(each.length(), max);
        }
        System.out.println(max);

        List<String> enUzunKelime = new ArrayList<>();
        for (String each : kelimeler) {
            if (each.length() == max) {
                enUzunKelime.add(each);
            }
        }
        System.out.println("enUzunKelime = " + enUzunKelime);

    }
}
