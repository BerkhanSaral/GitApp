package ssg_scanner0;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen uzun kenar kisa kenar ve yukseklik giriniz");
        double u=input.nextDouble();
        //System.out.println("lutfen kisa kenar giriniz");
        double k=input.nextDouble();
        if(u>k){
            //System.out.println("lutfen yukseklik kenar giriniz");
            double h=input.nextDouble();

            System.out.println("Prijmanin yukseklik"+u*k*h);
        }
        else {
            System.out.println("uzun kenar kisa kenardan uzun olamaz");
        }




    }
}
