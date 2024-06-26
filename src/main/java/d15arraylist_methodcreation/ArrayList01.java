package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.
        //Example 1: From a list with repeated elements, obtain a list with non-repeated elements.
        //      [J, a, v, a, v] ==> [J, a, v]

        List<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a);
        List<Character> b = new ArrayList<>();

        for (Character w : a) {
            if (!b.contains(w)) {//b `nin icinde w yoksa
                b.add(w);
            }
        }
        System.out.println(b);


    }
}
