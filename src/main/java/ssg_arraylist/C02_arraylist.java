package ssg_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class C02_arraylist {
    public static void main(String[] args) {
        /*
        bir list olusturun ve bu listteki
        elemanlari alfabetik siraya gore siralayin
         */

        ArrayList<String> citys = new ArrayList<>();
        citys.add("Angara");
        citys.add("Izmir");
        citys.add("Istanbul");
        citys.add("Bursa");
        citys.add("Antalya");
        citys.add("manisa");
        //Collections.sort(citys);
        citys.stream().sorted();
        System.out.println(citys);
    }
}
