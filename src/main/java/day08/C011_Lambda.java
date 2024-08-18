package day08;

import java.util.ArrayList;
import java.util.List;

public class C011_Lambda {
    public static void main(String[] args) {
        //11) Bir List'te karakter sayisi 7’den az olan tum elemanlari
        // tekrarsiz olarak console'a Buyuk harflerle yazdiran method'u olusturunuz.

        List<String> myList = new ArrayList<>();
        myList.add("Bayram");
        myList.add("Berkhan");
        myList.add("Emine");
        myList.add("Faruk");
        myList.add("Feyza");
        myList.add("Ilay");
        myList.add("Mustafa");
        myList.add("Levent");
        myList.add("Kubilay");
        myList.add("Nesibe");
        myList.add("Ahmet");
        myList.add("Arda");

        yedidenAzBuyuk(myList);


    }

    private static void yedidenAzBuyuk(List<String> myList) {
        myList.stream().distinct().filter(t->t.length()<7).forEach(t-> System.out.println(t.toUpperCase()));
    }
}
