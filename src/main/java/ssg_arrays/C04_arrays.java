package ssg_arrays;

import java.util.Arrays;

public class C04_arrays {
    public static void main(String[] args) {
        //soru-Verilen bir array'e yeni bir element ekleyin

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        int sayi = 9;
        int newArr[] = new int[arr.length + 1];
        System.out.println(Arrays.toString(newArr));
        int idx = 0;
        for (int a : arr) {
            newArr[idx] = a;
            idx++;
        }
        newArr[newArr.length - 1] = sayi;
        System.out.println(Arrays.toString(newArr));

        System.out.println();

        //for (int i = 0; i < arr.length; i++) {
        //   newArr[i] = arr[i];
        //}
        //newArr[newArr.length - 1] = sayi;
        //System.out.println(Arrays.toString(newArr));
    }
}
