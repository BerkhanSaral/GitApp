package ssg_mda;

import java.util.Arrays;

public class C01_mda {
    public static void main(String[] args) {
        /*
        soru 1)  bir multi-dimensional array olusturun
        ve olusturdugunuz arrayin elemanlarini yazdırınız
        */
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = {7, 8, 9};

        int[][] arr = {a, b, c};

        int[][] e = {{1, 2, 3}, {1, 2, 3}, {7, 8, 9}};
        System.out.println(Arrays.toString(e));
        System.out.println("Arrays.deepToString : " + Arrays.deepToString(e));
    }
}
