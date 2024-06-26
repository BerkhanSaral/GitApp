package ssg_arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {
        /*
            2.soru bir array olusturun ve olusturdugunuz arraydeki sayilari kucukten buyuge siralayin
        */
        int[] arr = {7, 1, 3, 5, 12, 34, 45, 11, 27, 18}; //lenght 10 //index 9
        System.out.println(Arrays.toString(arr));
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            int n;
            if (arr[i] > arr[i + 1]) {
                n = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = n;
            }
        }
      /*  for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int n = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = n;
                }

            }
        }*/
        System.out.println(Arrays.toString(arr));
    }
}

