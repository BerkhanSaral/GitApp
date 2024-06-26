package nestedforloop;

public class C02_nestedForLoop {
    public static void main(String[] args) {

        int toplamSatir = 10;

        for (int satir = 1; satir <= toplamSatir; satir++) {
            for (int yildiz = toplamSatir - satir; yildiz >= 1; yildiz--) {
                System.out.print("* ");
            }
            System.out.println();
            for (int nokta = 1; nokta <= satir; nokta++) {
                System.out.print(". ");
            }
            System.out.println();
        }

    }
}
