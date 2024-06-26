package d5increment_decrement_if;

import java.util.Locale;
import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in).useLocale(Locale.US);
        System.out.println("lutfen bir sayi giriniz");
        int num=input.nextInt();

        if(num>0){
            System.out.println(num+" Sayi 0`dan buyuk");
        }else if(num<0){
            System.out.println(num+" Sayi 0`dan kucuk");
        }else{
            System.out.println(num+" Sayi notr dur");
        }

    }
}
