package ssg_scanner0;

import java.util.Scanner;

public class C01_scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen isim girin");
        String isim=input.next();
        System.out.println(isim);
        System.out.println("soyad giriniz");
        String soyad=input.next();
        System.out.println(soyad);
    }
}
