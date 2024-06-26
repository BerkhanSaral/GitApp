package Proje_New_Update_Warehouse;

import java.util.Scanner;

//import static New_Update_Warehouse.Method.productList;
import static Proje_New_Update_Warehouse.Method.urunTanimlama;

public class App  {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        urunTanimlama();
        do {
            System.out.println("1-Urun Ekleme");
            System.out.println("1-Urun Listeleme");
            System.out.println("0-Cikis");
            try {
                int secim = input.nextInt();
                input.nextLine();
                switch (secim) {
                    case 1:
                        urunTanimlama();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;

                }

                if (secim == 0) {
                    break;
                }
            } catch (Exception e) {

                System.err.println("Hatalı giriş, lütfen sayısal bir giriş yapınız.");
                System.out.println();
                input.nextLine();
            }
        } while (true);
    }
}
