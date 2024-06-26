package day03;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        for (int satir = 1; satir <= 5; satir++) {
            for (int sutun = 1; sutun <=satir; sutun++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int satir = 4; satir>=1 ; satir--) {
            for (int sutun = 1; sutun <=satir ; sutun++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

