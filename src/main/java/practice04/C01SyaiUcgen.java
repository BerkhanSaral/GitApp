package practice04;

import java.util.Scanner;

public class C01SyaiUcgen {
    public static void main(String[] args) {
                /*
                Kullanıcıdan sisteme satır sayısını girmesini isteyiniz
                ve ardından aşağıdaki şekli bu sayıya göre yazdırın:

                Örneğin: Satır sayısı 4 için;
                1
                2 3
                4 5 6
                7 8 9 10
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen olusturmak istediginiz ucgenin satir sayisini giriniz");
        int satir = input.nextInt();
        int a = 1;
        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");

        a = 1;
        for (int i = satir; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                //System.out.printf("%3d",a);
                System.out.printf("%-3d", a);
                //System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
