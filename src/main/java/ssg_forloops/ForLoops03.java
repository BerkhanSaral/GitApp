package ssg_forloops;

import java.util.Scanner;

public class ForLoops03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen 100`den kucuk bir tam sayi giriniz");
        int sayi=input.nextInt();

        if(sayi<101&&sayi>0){
            for (int i = 1; i <sayi ; i++) {
                if(sayi%3==0){
                    System.out.println(sayi);
                }
            }
        }else {
            System.out.println("lutfen 100 den kucuk  pozitif bir tam sayi girerek tekrar deneyiniz");
        }




    }
}
