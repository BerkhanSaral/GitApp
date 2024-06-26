package nestedforloop;

public class C04_nestedForLoop {
    public static void main(String[] args) {
        int toplamSatir = 5;

        for (int satir = 1; satir <= toplamSatir; satir++) {
            for (int bosluk = toplamSatir - satir; bosluk >= 1; bosluk--) {
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= satir * 2 - 1; yildiz++) {
                if (yildiz == 1 || yildiz == satir * 2 - 1 || satir == (toplamSatir - toplamSatir / 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
