package nestedforloop;

public class C01_nestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print( i + "x" + j + " = " + i * j + "");
                System.out.println();
            }
            System.out.println();
        }
    }
}
