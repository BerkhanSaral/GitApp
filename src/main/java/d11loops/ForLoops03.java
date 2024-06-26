package d11loops;

import java.util.Scanner;

public class ForLoops03 {
    public static void main(String[] args) {
        /* Ornek 2:  Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz.
        Example 2:  Create the code that prints the following figure to the console.

              X X X X X
              X X X X X
              X X X X X    */
        Scanner input = new Scanner(System.in);
        System.out.println("satir giriniz");
        int row = input.nextInt();
        System.out.println("sutun giriniz");
        int column = input.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
        /*Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        Homework: Draw the following figure using for-loop.
        
            *
            * *
            * * *
            * * * *
        
        */
        int satir=4;
        int sutun=0;
        for (int i = 0; i < 6; i++) {
            
        }
        
        
    }
}
