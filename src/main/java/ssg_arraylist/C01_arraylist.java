package ssg_arraylist;

import java.util.ArrayList;

public class C01_arraylist {
    public static void main(String[] args) {
        /*
        soru 1) bir list olusturup eleman ekleyin ve yazdirin
        */

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(9);
        myList.add(11);
        System.out.println(myList);
    }
}
