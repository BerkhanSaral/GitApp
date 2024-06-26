package ssg_mda;

public class C02_mda {
    public static void main(String[] args) {


        /*
soru 2) verilen bir multi-dimensional array in
tum elementlerini yazdiran bir method olusturun
*/
        String[][] arr = {{"Ali", "Hasan"}, {"Veli", "Kerem"}, {"Huseyin", "Serkhan"}};
        elemanYazdir(arr);
    }

    public static void elemanYazdir(String[][] arr) {
        for (String[] w : arr) {
            for (String s : w) {
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}

