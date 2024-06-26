package EnginDemirog;

public class uygulamalarim {
    public static void main(String[] args) {
        /*
        int satir=6;
        for (int i = 1; i <satir ; i++) {
            for (int j = 1; j <satir ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        */
        /*
        int k = 1;
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "        ");
            }
            System.out.println();
        }
        */
        /*
        int toplamSatir = 6;
        for (int satir = 1; satir < toplamSatir; satir++) {
            for (int sutun = toplamSatir - satir; sutun >= 1; sutun--) {
                System.out.print(" * ");
            }
            for (int nokta = toplamSatir - satir; nokta < toplamSatir; nokta++) {
                System.out.print(" . ");
            }
            System.out.println();

        }
        *//*
        int satir = 5;
        for (int i = 1; i < satir; i++) {
            for (int j = 1; j < 6; j++) {
                if (i == 2 && j == 4)
                    System.out.print("! ");
                else if (i == 3 && j == 3)
                    System.out.print("! ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }*/
        /*
        int toplamSatir = 5;
        for (int satir = 1; satir <= toplamSatir; satir++) {
            for (int bosluk = toplamSatir - satir; bosluk >= 1; bosluk--) {
                System.out.print(" ");
            }

            for (int yildiz = 1; yildiz <= satir * 2 - 1; yildiz++) {
                if (yildiz == 1 || satir == toplamSatir - 2 || yildiz == satir * 2 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        fucc(2.1F, 3.2);
        */

        /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */
    /*    Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz :");
        int sayi = scan.nextInt();
        int toplam = 0;
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j < i; j++) {

                if (i % j == 0) {

                    toplam = toplam + j;
                }

            }
            if (toplam == i) {

                System.out.println(i + " Sayısı Bir Mükemmel Sayıdır.");
            }
            toplam = 0;*/


    }
/*
    public static void fucc(float i, double j) {
        System.out.println("good");
    }

    public static void fucc(double i, double j) {
        System.out.println("bad");
    }
    */


}



