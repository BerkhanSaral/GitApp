package d13array;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.

        //Example 1: Create an Array of type int called ages and place 6 elements in it,
        // display the sum of the smallest and the largest of these elements

        //sort() methodu sayilari kucukten buyuge siralar (ascending order)
        //String data tiplerini alfabetik siralar (alphabetical order)
        //ascending order + alphabetical order = natural order
        //sort() methodu Array elemanlarini natural order’a gore siralar


        int sum = 0;
        int[] ages = new int[6];
        ages[0] = 20;
        ages[1] = 25;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;
        //1.yol
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0] + ages[ages.length - 1]);//en kucuk ile en buuyk toplami
        //2.yol
        int minimum = ages[0];
        int maximum = ages[0];

        for (int w : ages) {
            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);
        }
        System.out.println(minimum);
        System.out.println(maximum);
        System.out.println(minimum + maximum);
    }
}
