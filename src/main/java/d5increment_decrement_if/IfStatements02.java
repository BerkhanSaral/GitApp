package d5increment_decrement_if;

import java.util.Locale;
import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("lutfen bir sayi giriniz");

        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("cift sayi");
        }
        if (num % 2 != 0) {
            System.out.println("tek sayi");
        }

        if (num % 2 == 0) {
            System.out.println("Sayi Cift");
        } else {
            System.out.println("Sayi tek");
        }

    }
}
