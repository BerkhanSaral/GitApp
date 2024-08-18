package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Lambda {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        //1) Bir list'teki tek elemanlari ayni satirda aralarina bosluk koyarak
        // yazdiran method'u olusturunuz.
        tekYazdiran1(myList);
        tekYazdiran2(myList);
    }

    public static void tekYazdiran1(List<Integer> myList) {
        for (Integer a : myList) {
            if (a % 2 != 0) {
                System.out.println(a + " ");
            }
        }
    }
    public static void tekYazdiran2(List<Integer> myList) {
        myList.stream().filter(t->t%2!=0).forEach(t-> System.out.println(t+" "));
    }
}
