package ssg_scanner0;

import java.util.Scanner;

public class C03_scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yari cap giriniz");
        double r = input.nextDouble();
        System.out.println("dairenin cevresi:" + 2 * Math.PI * r);
        System.out.println("daireinin alani:" + 3 * Math.pow(r, 2));


    }
}
