package day02;

import java.util.Locale;
import java.util.Scanner;

public class C06_Switch {
    public static void main(String[] args) {
        /*
           Kullanicidan ay numarasini sisteme girmesini isteyiniz.
           Eger girilen ay 2 numarali ay ise kullanicidan yil da isteyin.
           Bu bilgilere gore ayin kac gun cektigini yazdiriniz.

           NOT : 1, 3, 5, 7, 8, 10, 12. aylar 31 gun ceker
                 4, 6, 9, 11. aylar 30 gun ceker
                 2. ay 4 yilda bir 29 gun ceker, diger yillarda 28 gun ceker
         */

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("ay numarasi giriniz");
        byte monthNo = input.nextByte();

        switch (monthNo) {
            //case 1,3,5,7,8,9,10,12
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("aylar 31 gun ceker");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("aylar 30 gun ceker");
                break;
            case 2:
                System.out.println("lutfen ili giriniz");
                int year = input.nextInt();
             /*   if(year%4==0){
                    System.out.println("Girdiginiz ay 29 gun ceker");
                }
                else {
                    System.out.println("girilen ay 28 gun ceker");
                }*/
                System.out.println(year % 4 == 0 ? "Girdiginiz ay 29 gun ceker" : "girilen ay 28 gun ceker");
            default:
                System.out.println("Lutfen gecerli bir ag numarasi giriniz");
                break;

        }

    }
}
