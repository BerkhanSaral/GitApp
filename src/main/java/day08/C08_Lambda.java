package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_Lambda {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>(Arrays.asList(1, 7, 11, 23, 12, 14, 9, 47, 58, 91, 37, 37, 23, 8, 11, 1, 23, 23, 8));
        //8)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

        maksimum(mylist);
    }

    private static void maksimum(List<Integer> mylist) {
        mylist.stream().distinct().reduce((0), (t, u) -> t > u ? t : u);
        //  int max = mylist.stream().distinct().reduce(Math::max).get();
        //  System.out.println("Method icindeki max : "+max);
        // int max =mylist.stream().distinct().reduce(mylist.indexOf(0), Math::max);
        /// System.out.println("Method icindeki max : "+max);

    }
}
