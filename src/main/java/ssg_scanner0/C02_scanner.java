package ssg_scanner0;

import java.util.Scanner;

public class C02_scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen 1. tam sayi giriniz");
        int s1 = input.nextInt();
        System.out.println("lutfen 2. tam sayi giriniz");
        int s2 = input.nextInt();

        System.out.println("toplamlari:" + (s1 + s2));
        System.out.println("Farklari:" + (s1 - s2));

    }
}
