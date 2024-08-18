package day08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C12_Lambda {
    public static void main(String[] args) {
        List<String> mylist=new ArrayList<>();
        mylist.add("Bayram");
        mylist.add("Berkhan");
        mylist.add("Emine");
        mylist.add("Faruk");
        mylist.add("Feyza");
        mylist.add("Hulika");
        mylist.add("İlay");
        mylist.add("Mustafa");
        mylist.add("Levent");
        mylist.add("Kubilay");
        mylist.add("Nesibe");
        mylist.add("Ahmet");
        mylist.add("arda");
        List<String>newList=yedidenCokBuyuk(mylist);
        System.out.println("newList = " + newList);
    }
    //12) Bir List'teki karakter sayisi 7 ve 7’den cok olan tum elemanlari
    // buyuk harflerle bir listin icinde veren method'u olusturunuz.
    public static List<String> yedidenCokBuyuk(List<String>mylist){
        return mylist.stream().filter(t->t.length()>=7).map(String::toUpperCase).collect(Collectors.toList());

    }

}