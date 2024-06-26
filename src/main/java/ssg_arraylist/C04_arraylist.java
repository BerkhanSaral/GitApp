package ssg_arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class C04_arraylist {
    public static void main(String[] args) {
        /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
         */

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 200; i++) {
            int sayi = rnd.nextInt(1000);
            if(!myList.contains(sayi)){
                myList.add(sayi);
            }else {
                i--;
            }
        }
        System.out.println("myList = " + myList);
        System.out.println("myList.size() = " + myList.size());
        System.out.println("Lutfen sayi listesinde sayiniz varmi diye kontrol etmek icin kontrol ediniz");
        int sayi=input.nextInt();
        if(myList.contains(sayi)){
            System.out.println("Listede var");
        }else {
            System.out.println("Listede yok");
        }

    }
}
