package ssg_mda;

import java.util.Arrays;

public class C04_mda {
    public static void main(String[] args) {

        /*
 Soru 4) Asagidaki multi dimensional array'in
 ic array'lerindeki tum elemanlarin toplamini birer birer bulan
 ve herbir sonucu yeni bir array'in elemani yapan
 ve yeni array'i ekrana yazdiran bir program yaziniz
 Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
 */

        int[][] arr = {{1, 2, 3}, {4, 7, 9}, {54, 12}};
        int newArr[] = new int[arr.length];
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int a : arr[i]) {
                total += a;
            }
            newArr[i] = total;
            total = 0;
        }
        System.out.println(Arrays.toString(newArr));



    }
}
