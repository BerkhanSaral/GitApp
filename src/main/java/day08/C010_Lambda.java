package day08;

import java.util.ArrayList;
import java.util.List;

public class C010_Lambda {
    public static void main(String[] args) {
        //10) Bir List'teki A ile baslayanlar haric tum elemanlari
        //console'a yazdiran method'u olusturunuz.
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

        aHaric(myList);
    }

    private static void aHaric(List<String> myList) {
       //myList.stream().filter(t -> t.indexOf('A')==0).forEach(System.out::println);
       myList.stream().filter(t -> t.charAt(0)=='A').forEach(System.out::println);
        //myList.stream().filter(t -> t.startsWith("A")).forEach(System.out::println);
    }
}
