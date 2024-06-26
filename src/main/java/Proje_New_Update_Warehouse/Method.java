package Proje_New_Update_Warehouse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Method extends Newmethod {

    private static Map<Integer, Newmethod.Size> idCounters = new HashMap<>();

    static HashMap<String, Newmethod> productAdd = new HashMap<>();

    static {
        // Başlangıçta her beden için ID sayaçlarını başlatma
        idCounters.put(65542, Newmethod.Size.S);
        idCounters.put(75465, Newmethod.Size.M);
        idCounters.put(91876, Newmethod.Size.L);
    }


    public static void urunTanimlama() {
        Scanner input = new Scanner(System.in);
        // Örnek gömlekler oluşturuluyor

        System.out.println("Lutfen kiyafet katagorisini giriniz");
        String shirtType = input.nextLine();

        System.out.println("Lutfen kiyafet bedenini giriniz (Sadece S,M ve L girilebilir)");
        Newmethod.Size shirtSize = Newmethod.Size.valueOf(input.next());
        input.nextLine();
        System.out.println("Lutfen kiyafet markasini giriniz");
        String shirtCompany = input.nextLine();

        System.out.println("Lutfen kiyafet fiyatini giriniz");
        double shirtPrice = input.nextDouble();

        Newmethod.Shirt shirt = new Newmethod.Shirt(shirtType, shirtSize, shirtCompany, shirtPrice);

        productAdd.put(shirt.getId(), shirt); //ilk kısıma keylerimiz yani idlerimiz gelecek , ikinci kısım value  yani obje kısmı

        for (Map.Entry<String, Newmethod> w : productAdd.entrySet()) { //buradaki w da kalıp halinde entrylerimiz var
            //1000     |  1000  un , hemimoğlu , kg , 0 , -
            //(key)            (value)
        }
    }

    public static void urunListeleme() {

        System.out.printf("%-10s%-15s%-15s%-15s%-15s%-15s\n", "ID", "Ürün Adı", "Üretici", "Birim", "Miktar", "Raf");
        System.out.println("------------------------------------------------------------------------------");

        for (Map.Entry<String, Newmethod> w : productAdd.entrySet()) {
            Newmethod shirt = w.getValue();
            //System.out.printf("%-10s%-10s%-10s%-10.2f\n", shirt.getType(), shirt.getSize(), shirt.getCompany(), shirt.getPrice());
        }

        System.out.println();
        /*
        for (Map.Entry<Integer, Newmethod> w : productAdd.entrySet()) {
            Newmethod shirt = w.getValue();
            System.out.printf("%-10s%-10s%-10s%-10.2f\n", shirt.getType(), shirt.getSize(), shirt.getCompany(), shirt.getPrice());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Call the urunTanimlama method to add a product
        urunTanimlama();
        // Call the productList method to list all products
        productList();
    }*/

    }

}

