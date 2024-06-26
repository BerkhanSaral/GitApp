package d13array;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz.
        //Example 4: In the array [0, 2, 3, 0, 12, 0], place all zeros at the end.

        //     [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] arr = {0, 2, 3, 0, 12, 0};
        int[] newArr = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));

        int firstIndex = 0;//indexlere yukleme yaptikca bunu arttiracaz ki diger indexleri`de degistirelim

        for (int w : arr) {
            if (w != 0) {
                newArr[firstIndex] = w;//  newArr`nin ilk indexine gelen sayiyi yukledik
                firstIndex++;
            }
            System.out.println(Arrays.toString(newArr));
        }

        //Arraylerin esit olup olmadigi nasil anlasilir?

        int[] a = new int[3];
        a[0] = 2;
        a[1] = 1;
        a[2] = 3;

        int[] b = new int[3];
        b[0] = 2;
        b[1] = 1;
        b[2] = 3;
        //iki arrayin ayni olabilmesi icin, ayni index te ayni elemanlarin bulunmasi gerekir

        boolean result = Arrays.equals(a, b);
        System.out.println("result = " + result);

    }
}
