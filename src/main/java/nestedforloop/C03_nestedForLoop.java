package nestedforloop;

public class C03_nestedForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 2 && j == 4) {
                    System.out.print("! ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 2 && j == 4) {
                    System.out.print("! ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }
}

