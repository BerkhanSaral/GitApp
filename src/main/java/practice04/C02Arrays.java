package practice04;

import java.util.Arrays;
import java.util.Scanner;

public class C02Arrays {
    public static void main(String[] args) {
        /*
            3 elemanlı bir array olusturunuz (int)
            Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız
            Arrayin elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
            Ortalamadan daha büyük olan array elemanlarını yazdırınız.
        */
        Scanner input = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.println("lutfen arrays eklemek istediginiz elemani giriniz");
            int sayi = input.nextInt();
            arr[i] = sayi;
            System.out.println(Arrays.toString(arr));
        }


        double toplam = 0;

        for (int each : arr) {
         toplam+=each;
        }
        System.out.println("toplam = " + toplam);

        double ortalama=toplam/arr.length;
        System.out.println("ortalama = " + ortalama);

        for(int each:arr){
            if(each>ortalama){
                System.out.println(each);
            }
        }
    }
}
