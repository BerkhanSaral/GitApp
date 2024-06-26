package Proje_DepoUygulamasi;

public class Runner {
    public static void main(String[] args) {


        Product_And_Information.Shirt shirt1 = new Product_And_Information.Shirt("Sport Shirt :🎨 Mavi - Beyaz - Bej", Product_And_Information.Size.M, " U.S. Polo", 10.99);
        Product_And_Information.Shirt shirt2 = new Product_And_Information.Shirt("Sport Shirt :🎨Mavi - Beyaz - Bej", Product_And_Information.Size.L, " U.S. Polo", 10.99);
        Product_And_Information.Shirt shirt3 = new Product_And_Information.Shirt("Sport Shirt  :🎨Mavi - Beyaz - Bej", Product_And_Information.Size.S, " U.S. Polo", 10.99);

        // Gömlek detayları yazdırılıyor
        System.out.println("***************************************");
        shirt1.printDetails();

        System.out.println("***************************************");
        shirt2.printDetails();

        System.out.println("***************************************");
        shirt3.printDetails();

        System.out.println();
        System.out.println();


    }
}