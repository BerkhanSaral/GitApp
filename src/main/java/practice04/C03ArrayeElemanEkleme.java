package practice04;

import java.util.Arrays;

public class C03ArrayeElemanEkleme {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 11};
        int eklenecek = 5;

        int[] secondArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            secondArr[i] = arr[i];
        }
        secondArr[secondArr.length - 1] = eklenecek;
        System.out.println("secondArr = " + Arrays.toString(secondArr));

        arr=secondArr;

    }
}
