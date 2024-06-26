package day05;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {
        /*
             mdarray oluşturun yazdırın
             daha sonra bu mda ' yi, her bir elemanı iç array elemanlarının toplamına eşit olan tek boyutlu
             bir array haline getirin
             ör --> int [] [] arr={{3,4},{1,2},{8,7}} --------> {7,3,15}
        */

        int[][] arr = {{3, 4}, {1, 2}, {8, 7}, {7, 3, 15}};
        int[] newArr = new int[arr.length];
        System.out.println(Arrays.deepToString(arr));
        int total = 0;
        int idx = 0;
        /*for (int[] each : arr) {
            for (int each2 : each) {
                total += each2;
            }
            newArr[idx] = total;
            idx++;
            total = 0;
        }*/
        for (int i=0;i<arr.length;i++) {
            for (int each2 : arr[i]) {
                total += each2;
            }
            newArr[i] = total;
            total = 0;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
