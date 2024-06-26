package ssg_arrays;

import java.util.Arrays;

public class C03_arrays {
    public static void main(String[] args) {
         /*
            3.soru Verilen array
            in tum elemanlarini bir soldaki konuma tasiyacak
            bir program yazin. Ornek; array ((1,2,3)) ise output (2, 3, 1) olacak
        */
        String[] arr = {"a", "b", "c", "d", "e"};
        String str = arr[0];
//        System.out.println(Arrays.toString(arr));
//        arr[0] = arr[1];
//        System.out.println(Arrays.toString(arr));
//        arr[1] = arr[2];
//        System.out.println(Arrays.toString(arr));
//        arr[2] = str;
//        System.out.println(Arrays.toString(arr));

        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(Arrays.toString(arr));
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = str;
        System.out.println(Arrays.toString(arr));

        /////////////////////////////////////

        int[] arri = {1,2,3,4,5};
        int sonKarakter = arri[0];
//        System.out.println(Arrays.toString(arr));
//        arr[0] = arr[1];
//        System.out.println(Arrays.toString(arr));
//        arr[1] = arr[2];
//        System.out.println(Arrays.toString(arr));
//        arr[2] = str;
//        System.out.println(Arrays.toString(arr));

        System.out.println();

        for (int i = 0; i < arri.length - 1; i++) {
            System.out.println(Arrays.toString(arri));
            arri[i] = arri[i + 1];
        }
        arri[arri.length - 1] = sonKarakter;
        System.out.println(Arrays.toString(arri));
    }
}
